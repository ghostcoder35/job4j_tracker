package ru.job4j.polymorphism;

public interface Transport {
    void drive();

    void passengers(int pass);

    default int fill(int fuel) {
        int price = 50;
        return price * fuel;
    }
}
