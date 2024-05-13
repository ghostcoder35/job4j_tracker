package ru.job4j.io;

import java.util.Random;

public class RandomAnswer {

    public String getRandomAnswer() {
        int answer = new Random().nextInt(3);
        return switch (answer) {
            case 0 -> "Да";
            case 1 -> "Нет";
            default -> "Может быть";
        };
    }
}