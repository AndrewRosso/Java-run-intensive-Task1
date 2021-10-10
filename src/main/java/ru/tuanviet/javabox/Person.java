package ru.tuanviet.javabox;

import static org.apache.commons.lang3.text.WordUtils.*;

public class Person {
    private String firstName;
    private String secondName;


    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void getInfo () {
        System.out.println(capitalizeFully(firstName)+" "+ capitalizeFully(secondName));
    }
}