package ru.job4j.inheritance;

public class Engineer extends Profession {

    private boolean haveAssistant;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void createProject() {
    }
}
