package com.movieservice;

import java.util.List;

public class Credit {
    private Person person;

    public Credit() {
    }

    public Credit(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
