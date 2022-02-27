package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String programmerLanguage;

    public Programmer(String name, String surname, String education, String birthday, boolean haveAssistant, String programmerLanguage) {
        super(name, surname, education, birthday, haveAssistant);
        this.programmerLanguage = programmerLanguage;
    }

    public void createProgram() {
    }

    public String getProgrammerLanguage() {
        return programmerLanguage;
    }
}
