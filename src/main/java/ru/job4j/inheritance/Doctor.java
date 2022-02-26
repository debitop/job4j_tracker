package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String foreignLanguage;

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void heal() {
    }
}
