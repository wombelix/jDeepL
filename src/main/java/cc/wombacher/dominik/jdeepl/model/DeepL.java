package cc.wombacher.dominik.jdeepl.model;

import java.io.IOException;

import cc.wombacher.dominik.jdeepl.IDeepL;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class DeepL {

    public Usage getUsage() {
        /*
         * Requires VM Option '--add-opens java.base/java.lang.invoke=retrofit2' as Workaround to avoid Exception in Java 11
         * see: https://github.com/square/retrofit/issues/3448
         */
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Settings.getInstance().getApiUrl())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        IDeepL service = retrofit.create(IDeepL.class);
        Call<Usage> call = service.getUsage(Settings.getInstance().getApiKey());
        Response<Usage> response = null;
        try {
            response = call.execute();
        }
        catch (IOException eIn) {
            throw new RuntimeException(eIn);
        }
        return response.body();
    }
}
