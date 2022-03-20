package cc.wombacher.dominik.jdeepl;

import cc.wombacher.dominik.jdeepl.model.Usage;
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
    private static Settings settings;

    public Main() {
        this.settings = new Settings();
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoadView = new FXMLLoader(Main.class.getResource("mainView.fxml"));
        Scene sceneView = new Scene(fxmlLoadView.load());
        stage.onCloseRequestProperty().setValue(e -> Platform.exit());
        stage.setTitle("jDeepL - Cross Platform GUI");
        stage.setScene(sceneView);
        stage.show();
    }

    public static Settings getSettings() {
        return settings;
    }

    public static void main(String[] args) {
        /*
         * Requires VM Option '--add-opens java.base/java.lang.invoke=retrofit2' as Workaround to avoid Exception in Java 11
         * see: https://github.com/square/retrofit/issues/3448
         */
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api-free.deepl.com/v2/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        IDeepL service = retrofit.create(IDeepL.class);
        Call<Usage> call = service.getUsage(settings.getApiKey());
        Response<Usage> response = null;
        try {
            response = call.execute();
        }
        catch (IOException eIn) {
            throw new RuntimeException(eIn);
        }
        Usage usage = response.body();
        System.out.println(usage.getUsageCharacterCount() + " / " + usage.getUsageCharaceterLimit());
        launch();
    }
}