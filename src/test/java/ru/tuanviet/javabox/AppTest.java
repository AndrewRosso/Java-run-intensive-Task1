package ru.tuanviet.javabox;


import static org.assertj.core.api.Assertions.*;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.sun.net.httpserver.HttpServer;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class AppTest {
    OkHttpClient client;
    NamesService myService;

    @Before
    public void setUp() throws Exception {
        client = new OkHttpClient();
        myService = new NamesService(FirstNameLibrary, SecondNameLibrary);
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertThat(true).isTrue();
    }


    @Test
    public void shouldServiceGetFirstNameAndSecondNameFromLibrary() {

        Person myPerson = myService.getRandomPerson();

        assertThat(myPerson.getFirstName()).isNotEmpty();
        assertThat(myPerson.getSecondName()).isNotEmpty();

    }


//    @Test
//
//    public void shouldGetForPersonFirstNamesAndSecondName () {
//
//        Person person = new Person();
//
//        person.setFirstName (1);
//        person.setSecondName (1);
//
//        assertThat(person.getFirstName).isEqualTo("АЛЕКСАНДР");
//        assertThat(person.getSecondName).isEqualTo("абажур");
//    }
}
