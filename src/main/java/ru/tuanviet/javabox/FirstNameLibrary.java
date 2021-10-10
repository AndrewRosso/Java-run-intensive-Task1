package ru.tuanviet.javabox;

import java.util.List;

public class FirstNameLibrary {

    private static final String URL_NAMES_API ="https://api.npoint.io/f744aa71f0b7c142f0fd";

    private List<String> names;

    public FirstNameLibrary() {
    }

    public List<String> getNames() {
        return names;
    }


    public static String getUrlNamesApi() {
        return URL_NAMES_API;
    }
//
//    @Override
//    public String getName(List<String> Name) {
//        return null;
//    }
}
