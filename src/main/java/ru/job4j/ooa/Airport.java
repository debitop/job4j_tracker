package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        final Airbus airbus = new Airbus("А320");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();
        airbus.setName("А380");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();
    }
}
