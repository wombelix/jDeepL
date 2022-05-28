/*
 * SPDX-FileCopyrightText: 2022 Dominik Wombacher <dominik@wombacher.cc>
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package cc.wombacher.dominik.jdeepl.controller;

import cc.wombacher.dominik.jdeepl.model.DeepL;
import cc.wombacher.dominik.jdeepl.model.Settings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SettingsViewController {
    @FXML
    private Button btnSaveApiKey;
    @FXML
    private TextField txtApiKey;
    @FXML
    private Label lblApiKeyUpdateStatus;

    @FXML
    protected void initialize() {
        txtApiKey.setText(Settings.getInstance().getApiKey());
    }
    @FXML
    protected void onBtnSaveApiKeyClick() {
        DeepL deepl = new DeepL();
        try {
            String apiKey = txtApiKey.getText();
            deepl.getUsage(apiKey, Settings.getInstance().mapApiKeyToUrl(apiKey));
            Settings.getInstance().setApiKey(txtApiKey.getText());
            Stage stage = (Stage) btnSaveApiKey.getScene().getWindow();
            stage.close();
        }
        catch (Exception eIn) {
            lblApiKeyUpdateStatus.setText("Error: API Key invalid or API not reachable, Key not saved!");
        }
    }
}
