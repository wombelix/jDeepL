package cc.wombacher.dominik.jdeepl;

import cc.wombacher.dominik.jdeepl.model.Usage;
import cc.wombacher.dominik.jdeepl.model.Settings;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class Main extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoadView = new FXMLLoader(Main.class.getResource("mainView.fxml"));
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