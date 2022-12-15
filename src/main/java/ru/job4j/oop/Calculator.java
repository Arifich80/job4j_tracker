package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int minus(int y) {
        return y - x;
    }

    public static int sum(int y) {
        return y + x;
    }

    public int multiply(int y) {
        return y * x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return minus(y) + sum(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        int rsl = Calculator.minus(5);
        System.out.println(rsl);
        Calculator calculator = new Calculator();
        int rsl1 = calculator.divide(5);
        System.out.println(rsl1);
        Calculator calculator2 = new Calculator();
        int rsl3 = calculator2.sumAllOperation(5);
        System.out.println(rsl3);

    }
}

