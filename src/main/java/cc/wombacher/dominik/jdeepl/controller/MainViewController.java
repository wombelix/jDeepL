package cc.wombacher.dominik.jdeepl.controller;

import java.util.Map;

import cc.wombacher.dominik.jdeepl.Main;
import cc.wombacher.dominik.jdeepl.model.DeepL;
import cc.wombacher.dominik.jdeepl.model.Settings;
import cc.wombacher.dominik.jdeepl.model.Translate;
import cc.wombacher.dominik.jdeepl.model.TranslationLanguage;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainViewController implements NativeKeyListener {
    @FXML
    private Label lblApiType;
    @FXML
    private Label lblApiUsage;
    @FXML
    private ComboBox<TranslationLanguage> boxSourceLang;
    @FXML
    private ComboBox<TranslationLanguage> boxTargetLang;
    @FXML
    private TextArea txtSourceText;
    @FXML
    private TextArea txtTargetText;

    private StringBuilder shortcutBuffer;
    private final String CONTROLKEY;
    private final String KEYS;
    private final String SHORTCUT;

    public MainViewController() {
        this("Ctrl", "CC");
    }
    public MainViewController(String controlKeys, String keys) {
        this.shortcutBuffer = new StringBuilder();
        this.CONTROLKEY = controlKeys;
        this.KEYS = keys;
        this.SHORTCUT = this.CONTROLKEY + this.KEYS;
    }

    @FXML
    protected void initialize() {
        GlobalScreen.addNativeKeyListener(this);

        DeepL deepl = new DeepL();

        lblApiType.setText(Settings.getInstance().getApiType());
        try {
            lblApiUsage.setText(deepl.getUsage().toString());
        }
        catch (Exception eIn) {
            lblApiUsage.setText("n/a");
        }
        boxSourceLang.setItems(Settings.getInstance().getSourceLang());
        boxTargetLang.setItems(Settings.getInstance().getTargetLang());
        boxSourceLang.getSelectionModel().select(5);
        boxTargetLang.getSelectionModel().select(3);
    }

    /*
     * Based on: https://stackoverflow.com/a/27178999
     */
    @FXML
    protected void onBtnOpenSettingsClick(ActionEvent event) throws Exception {
        try {
            FXMLLoader fxmlLoadSettings = new FXMLLoader(Main.class.getResource("settingsView.fxml"));
            Parent parent = fxmlLoadSettings.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Settings");
            stage.setScene(new Scene(parent));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onBtnTranslateTextClick(ActionEvent event) throws Exception {
        txtTargetText.clear();
        DeepL deepl = new DeepL();
        Translate translate = deepl.getTranslate(
                txtSourceText.getText(),
                boxSourceLang.getSelectionModel().getSelectedItem().getId(),
                boxTargetLang.getSelectionModel().getSelectedItem().getId()
                );
        for (Map<String, String> result : translate.getTranslations()) {
            txtTargetText.appendText(result.get("text"));
        }
        lblApiUsage.setText(deepl.getUsage().toString());
    }

    public void nativeKeyPressed(NativeKeyEvent e) {
        if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals(CONTROLKEY) ||
                this.shortcutBuffer.length() > SHORTCUT.length()) {
            this.shortcutBuffer.setLength(0);
        }
        this.shortcutBuffer.append(NativeKeyEvent.getKeyText(e.getKeyCode()));
        if (this.shortcutBuffer.toString().equals(SHORTCUT)) {
            Stage stage = (Stage) txtSourceText.getScene().getWindow();
            stage.setIconified(true);
            stage.setIconified(false);

            Clipboard clipboard = Clipboard.getSystemClipboard();
            txtSourceText.setText(clipboard.getString());

            try {
                this.onBtnTranslateTextClick(null);
            }
            catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void nativeKeyReleased(NativeKeyEvent e) {}
    public void nativeKeyTyped(NativeKeyEvent e) {}
}