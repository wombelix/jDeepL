package cc.wombacher.dominik.jdeepl;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.dustinredmond.fxtrayicon.FXTrayIcon;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoadView = new FXMLLoader(Main.class.getResource("mainView.fxml"));
        Scene sceneView = new Scene(fxmlLoadView.load());

        FXTrayIcon trayIcon = new FXTrayIcon.Builder(
                stage, getClass().getResource("translate.png"), 32, 32)
                .addExitMenuItem()
                .applicationTitle("jDeepL")
                .show()
                .build();

        stage.setTitle("jDeepL - Cross Platform Translator");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("translate.png")));
        stage.setScene(sceneView);
        stage.show();
    }

    public static void main(String[] args) {
        try {
            GlobalScreen.registerNativeHook();
        }
        catch (NativeHookException ex) {
            System.err.println("Keyboard Listener registration failed");
            System.err.println(ex.getMessage());
            System.exit(1);
        }

        GlobalScreen.addNativeKeyListener(new KeyboardListener());

        launch();
    }
}