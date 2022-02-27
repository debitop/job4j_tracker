package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String foreignLanguage;

    public Doctor(String name, String surname, String education, String birthday, String foreignLanguage) {
        super(name, surname, education, birthday);
        this.foreignLanguage = foreignLanguage;
    }

    public void heal() {
    }

    public String getForeignLanguage() {
        return foreignLanguage;
    }
}
