package ru.tuanviet.javabox;


import java.util.List;

public class SecondNameLibrary implements INamesLibrary {
    private List<String> secondNames;

    public SecondNameLibrary() {
    }

    public List<String> getSecondNames() {
        return secondNames;
    }

}
