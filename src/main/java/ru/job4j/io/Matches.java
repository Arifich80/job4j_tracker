package ru.job4j.io;

import java.util.Scanner;
public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println("Количество спичек на столе: " + count);
            System.out.print(player + " " + "выберите количество спичек от 1 до 3: \n");
            int select = Integer.valueOf(input.nextLine());
            if (select < 1 || select > Math.min(3, count)) {
                System.out.println("Ошибка ввода");
            } else {
                count -= select;
                turn = !turn;
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок!");
        } else {
            System.out.println("Выиграл второй игрок!");
        }
    }
}
