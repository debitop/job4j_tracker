package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private boolean workWithChildren;

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void operate() {
    }
}
