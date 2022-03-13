package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("the bus is moving");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("number of passengers " + passengers);
    }

    @Override
    public int refuel(int fuel) {
        int price = fuel * 100;
        return price;
    }
}
