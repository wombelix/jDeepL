package cc.wombacher.dominik.jdeepl;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.json.JSONTokener;

public class DeepLRestAPI {
    private Settings settings = new Settings();
    private String apiUrl;
    private Integer usageCharacterCount;
    private Integer usageCharaceterLimit;

    public DeepLRestAPI() {
        if (settings.getApiKey().endsWith(":fx")) {
            this.apiUrl = "https://api-free.deepl.com/v2";
        }
        else {
            this.apiUrl = "https://api.deepl.com/v2/";
        }
    }

    /*
     * Based on: https://www.baeldung.com/httpurlconnection-post
     */
    public void updateUsage() {
        Map values = new HashMap<String, String>();
        values.put("auth_key", settings.getApiKey());

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody;
        try {
            requestBody = objectMapper
                    .writeValueAsString(values);
        }
        catch (JsonProcessingException eIn) {
            throw new RuntimeException(eIn);
        }

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(this.apiUrl + "/usage"))
                .GET(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request,
                    HttpResponse.BodyHandlers.ofString());
        }
        catch (IOException eIn) {
            throw new RuntimeException(eIn);
        }
        catch (InterruptedException eIn) {
            throw new RuntimeException(eIn);
        }

        System.out.println(response.body());
    }

    private static HttpRequest.BodyPublisher buildFormDataFromMap(Map<Object, Object> data) {
        var builder = new StringBuilder();
        for (Map.Entry<Object, Object> entry : data.entrySet()) {
            if (builder.length() > 0) {
                builder.append("&");
            }
            builder.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
            builder.append("=");
            builder.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
        }
        System.out.println(builder);
        return HttpRequest.BodyPublishers.ofString(builder.toString());
    }
}
