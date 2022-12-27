package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает.");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + " тормозит реверсом.");
    }
}
