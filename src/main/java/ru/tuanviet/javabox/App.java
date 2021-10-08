package ru.tuanviet.javabox;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws IOException {
        Request requestNamesApi = new Request.Builder().url("https://api.npoint.io/f744aa71f0b7c142f0fd").build();
        Request requestNounsApi = new Request.Builder().url("https://api.npoint.io/a742b65192a1e1e22858").build();

        OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(30, TimeUnit.SECONDS);
        ObjectMapper objectMapper = new ObjectMapper();

        ResponseBody responseBodyNamesApi = client.newCall(requestNamesApi).execute().body();
        ResponseBody responseBodyNounseApi = client.newCall(requestNounsApi).execute().body();

        FirstNameLibrary firstNameLibrary = objectMapper.readValue(responseBodyNamesApi.string(), FirstNameLibrary.class);

        List<String> secondNameLibrary = objectMapper.readValue(responseBodyNounseApi.string(),
                new TypeReference<List<String>>() {});
        System.out.println(secondNameLibrary);
    }
}
