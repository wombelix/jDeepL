package cc.wombacher.dominik.jdeepl;

import cc.wombacher.dominik.jdeepl.model.Translate;
import cc.wombacher.dominik.jdeepl.model.Usage;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface IDeepL {
    @FormUrlEncoded
    @POST("usage")
    Call<Usage> getUsage(@Field("auth_key") String authKey);

    @FormUrlEncoded
    @POST("translate")
    Call<Translate> getTranslate(
            @Field("auth_key") String authKey,
            @Field("text") String sourceText,
            @Field("source_lang") String sourceLanguage,
            @Field("target_lang") String targetLanguage
    );
}
