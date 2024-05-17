package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Маршрут №1");
    }

    @Override
    public void passengers(int pass) {
        System.out.printf("Пассажиров в автобусе %d%n", pass);
    }

    @Override
    public int fill(int fuel) {
        return Transport.super.fill(fuel);
    }
}
