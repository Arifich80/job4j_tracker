package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Движение автобуса.");
    }

    @Override
    public void getPassNumber() {
        System.out.println("50 пассажиров");
    }

    @Override
    public double refill(double liters) {
        return liters * 50;
    }
}



