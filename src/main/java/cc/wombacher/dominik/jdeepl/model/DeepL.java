/*
 * SPDX-FileCopyrightText: 2022 Dominik Wombacher <dominik@wombacher.cc>
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package cc.wombacher.dominik.jdeepl.model;

import cc.wombacher.dominik.jdeepl.IDeepL;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class DeepL {

    public Usage getUsage() throws Exception {
        return getUsage(Settings.getInstance().getApiKey(), Settings.getInstance().getApiUrl());
    }

    public Usage getUsage(String apiKey, String apiUrl) throws Exception {
        /*
         * Requires VM Option '--add-opens java.base/java.lang.invoke=retrofit2' as Workaround to avoid Exception in Java 11
         * see: https://github.com/square/retrofit/issues/3448
         */
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(apiUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        IDeepL service = retrofit.create(IDeepL.class);
        Call<Usage> call = service.getUsage(apiKey);
        Response<Usage> response = null;
        response = call.execute();
        return response.body();
    }

    public Translate getTranslate(String sourceText, String sourceLanguage, String targetLanguage) throws Exception {
        /*
         * Requires VM Option '--add-opens java.base/java.lang.invoke=retrofit2' as Workaround to avoid Exception in Java 11
         * see: https://github.com/square/retrofit/issues/3448
         */
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Settings.getInstance().getApiUrl())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        IDeepL service = retrofit.create(IDeepL.class);
        Call<Translate> call = service.getTranslate(Settings.getInstance().getApiKey(), sourceText, sourceLanguage, targetLanguage);
        Response<Translate> response = null;
        response = call.execute();
        return response.body();
    }
}
