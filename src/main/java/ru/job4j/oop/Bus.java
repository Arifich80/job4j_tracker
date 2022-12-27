package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ездит по догорам.");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + " тормозит колодками.");
    }
}
