package cc.wombacher.dominik.jdeepl;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField txtApiKey;
    @FXML
    private Label lblApiKey;
    private Settings settings = new Settings();

    @FXML
    protected void initialize() {
        lblApiKey.setText(getLblApiKeyText());
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