package ru.tuanviet.javabox;


import java.util.List;

public class SecondNameLibrary {

    private static final String URL_NOUNCE_API ="https://api.npoint.io/a742b65192a1e1e22858";

    private List<String> secondNames;

    public SecondNameLibrary() {
    }

    public void setSecondNames(List<String> secondNames) {
        this.secondNames = secondNames;
    }

    public List<String> getNames() {
        return secondNames;
    }

    public static String getUrlNounceApi() {
        return URL_NOUNCE_API;
    }
//    @Override
//    public String getName(List<String> Name) {
//        return null;
//    }
}
