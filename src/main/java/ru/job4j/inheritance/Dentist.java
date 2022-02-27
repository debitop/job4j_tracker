package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int category;

    public Dentist(String name, String surname, String education, String birthday, String foreignLanguage, int category) {
        super(name, surname, education, birthday, foreignLanguage);
        this.category = category;
    }

    public void removeTooth() {
    }

    public int getCategory() {
        return category;
    }
}
