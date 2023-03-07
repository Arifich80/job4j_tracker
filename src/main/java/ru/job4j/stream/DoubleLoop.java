package ru.job4j.stream;


import java.util.stream.Stream;

public class DoubleLoop {
    public static void main(String[] args) {
        String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
        String[] values = {"V_6", "V_7", "V_8"};
        Stream.of(suits)
                .flatMap(suit -> Stream.of(values)
                        .map(value -> suit + " " + value))
                .forEach(System.out::println);
    }
}