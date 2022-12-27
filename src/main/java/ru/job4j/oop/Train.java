package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ездит по рельсам.");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + " тормозит электродвигателем.");
    }
}
