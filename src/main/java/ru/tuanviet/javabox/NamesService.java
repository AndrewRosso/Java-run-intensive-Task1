package ru.tuanviet.javabox;

import java.util.List;

public class NamesService {
    private FirstNameLibrary firstNameLibrary;
    private SecondNameLibrary secondNameLibrary;

    public NamesService(FirstNameLibrary firstNameLibrary, SecondNameLibrary secondNameLibrary) {
        this.firstNameLibrary = firstNameLibrary;
        this.secondNameLibrary = secondNameLibrary;
    }

    public Person getRandomPerson() {
        return new Person(getRandomName(firstNameLibrary.getNames()),
                getRandomName(secondNameLibrary.getNames()));
    }

    private String getRandomName(List<String> names) {
        return names.get((int) (Math.random() * names.size()));
    }



}
