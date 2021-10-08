package ru.tuanviet.javabox;

import java.util.List;

public class FirstNameLibrary implements INamesLibrary{
    private List<String> names;

    public FirstNameLibrary() {
    }

    public List<String> getNames() {
        return names;
    }
}
