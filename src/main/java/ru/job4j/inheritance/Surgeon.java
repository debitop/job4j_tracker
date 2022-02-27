package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private boolean workWithChildren;

    public Surgeon(String name, String surname, String education, String birthday, String foreignLanguage, boolean workWithChildren) {
        super(name, surname, education, birthday, foreignLanguage);
        this.workWithChildren = workWithChildren;
    }

    public void operate() {
    }

    public boolean getWorkWithChildren() {
        return workWithChildren;
    }
}
