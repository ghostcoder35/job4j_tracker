package ru.job4j.polymorphism;

public class Main {
    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.drive();
        bus.passengers(50);
        System.out.println(bus.fill(40));
    }
}
