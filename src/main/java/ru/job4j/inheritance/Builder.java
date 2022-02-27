package ru.job4j.inheritance;

public class Builder extends Engineer {

    private boolean haveCar;

    public Builder(String name, String surname, String education, String birthday, boolean haveAssistant, boolean haveCar) {
        super(name, surname, education, birthday, haveAssistant);
        this.haveCar = haveCar;
    }

    public void buidHouse() {
    }

    public boolean getHaveCar() {
        return haveCar;
    }
}
