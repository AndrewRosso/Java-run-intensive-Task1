package ru.tuanviet.javabox;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws IOException {
        Request requestNamesApi = new Request.Builder().url(FirstNameLibrary.getUrlNamesApi()).build();
        Request requestNounsApi = new Request.Builder().url(SecondNameLibrary.getUrlNounceApi()).build();
        OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(30, TimeUnit.SECONDS);

        ResponseBody responseBodyNamesApi = client.newCall(requestNamesApi).execute().body();
        ResponseBody responseBodyNounseApi = client.newCall(requestNounsApi).execute().body();

        ObjectMapper objectMapper = new ObjectMapper();
        FirstNameLibrary firstNameLibrary = objectMapper.readValue(responseBodyNamesApi.string(), FirstNameLibrary.class);
        List<String> secondNameLibrary = objectMapper.readValue(responseBodyNounseApi.string(),
                new TypeReference<List<String>>() {});

//        System.out.println(firstNameLibrary.getNames());
//        System.out.println(secondNameLibrary);


        SecondNameLibrary listSecondName = new SecondNameLibrary();
        listSecondName.setSecondNames(secondNameLibrary);

        NamesService namesService = new NamesService(firstNameLibrary,listSecondName);

        for (int i=0;i<3;i++) {
            namesService.getRandomPerson().getInfo();
        }

    }
}
