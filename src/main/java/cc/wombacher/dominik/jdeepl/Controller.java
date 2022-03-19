package cc.wombacher.dominik.jdeepl;

import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class Controller {
    @FXML
    private TextField txtApiKey;
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
    @FXML
    protected void onBtnSaveApiKeyClick() {
        settings.setApiKey(txtApiKey.getText());
        lblApiKey.setText(getLblApiKeyText());
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