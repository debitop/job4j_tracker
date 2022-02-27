package ru.job4j.inheritance;

public class Engineer extends Profession {

    private boolean haveAssistant;

    public Engineer(String name, String surname, String education, String birthday, boolean haveAssistant) {
        super(name, surname, education, birthday);
        this.haveAssistant = haveAssistant;
    }

    public void createProject() {
    }

    public boolean getHaveAssistant() {
        return haveAssistant;
    }

}
