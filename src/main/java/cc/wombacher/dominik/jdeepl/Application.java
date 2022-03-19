package cc.wombacher.dominik.jdeepl;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoadView = new FXMLLoader(Application.class.getResource("view.fxml"));
        Scene sceneView = new Scene(fxmlLoadView.load());
        stage.onCloseRequestProperty().setValue(e -> Platform.exit());
        stage.setTitle("jDeepL - Cross Platform GUI");
        stage.setScene(sceneView);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}