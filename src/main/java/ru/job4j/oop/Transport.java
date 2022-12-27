package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[]{plane, bus, train};
        for (Vehicle a : vehicles) {
            a.move();
        }
        System.out.println();
        for (Vehicle a : vehicles) {
                a.brake();
        }
    }
}
