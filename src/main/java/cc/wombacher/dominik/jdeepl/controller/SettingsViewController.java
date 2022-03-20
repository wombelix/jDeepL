package cc.wombacher.dominik.jdeepl.controller;

import cc.wombacher.dominik.jdeepl.Settings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerSettings {
    @FXML
    private Button btnSaveApiKey;
    @FXML
    private TextField txtApiKey;
    private Settings settings = new Settings();

    @FXML
    protected void initialize() {
        txtApiKey.setText(settings.getApiKey());
    }
    @FXML
    protected void onBtnSaveApiKeyClick() {
        settings.setApiKey(txtApiKey.getText());
        Stage stage = (Stage) btnSaveApiKey.getScene().getWindow();
        stage.close();
    }
}
