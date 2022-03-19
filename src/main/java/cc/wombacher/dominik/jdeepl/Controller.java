package cc.wombacher.dominik.jdeepl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private Label lblApiKey;
    @FXML
    private ComboBox<TranslationLanguage> boxSourceLang;
    @FXML
    private ComboBox<TranslationLanguage> boxTargetLang;
    private Settings settings = new Settings();

    @FXML
    protected void initialize() {
        lblApiKey.setText(getLblApiKeyText());
        boxSourceLang.setItems(settings.getSourceLang());
        boxTargetLang.setItems(settings.getTargetLang());
        boxSourceLang.getSelectionModel().select(5);
        boxTargetLang.getSelectionModel().select(3);
    }

    /*
     * Based on: https://stackoverflow.com/a/27178999
     */
    @FXML
    protected void onBtnOpenSettingsClick(ActionEvent event) throws Exception {
        try {
            FXMLLoader fxmlLoadSettings = new FXMLLoader(Application.class.getResource("settings.fxml"));
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

    private String getLblApiKeyText() {
        String apiKey = settings.getApiKey();
        StringBuilder sb = new StringBuilder();
        sb.append("API Key: ");
        sb.append(apiKey);
        if (apiKey.endsWith(":fx")) {
            sb.append(" (DeepL API Free)");
        } else {
            sb.append(" (DeepL API Pro)");
        }
        return sb.toString();
    }
}