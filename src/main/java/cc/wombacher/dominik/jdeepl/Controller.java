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
    private final String LBLAPIPREFIX = "API Key: ";

    @FXML
    protected void initialize() {
        lblApiKey.setText(LBLAPIPREFIX + settings.getApiKey());
    }
    @FXML
    protected void onBtnSaveApiKeyClick() {
        settings.setApiKey(txtApiKey.getText());
        lblApiKey.setText(LBLAPIPREFIX + settings.getApiKey());
    }
}