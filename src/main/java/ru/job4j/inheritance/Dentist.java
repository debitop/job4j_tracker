package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int category;

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void removeTooth() {
    }
}
