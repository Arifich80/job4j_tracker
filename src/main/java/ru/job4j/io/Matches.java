package ru.job4j.io;

import java.util.Scanner;

public class Matches {

   /*static int matches = 11; */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            System.out.println("Количество спичек на столе: " + count);
            System.out.print("Выберите количество спичек от 1 до 3: \n");
            int select = Integer.valueOf(input.nextLine());
            turn = !turn;
            if (select < 1 || select > 3) {
                System.out.println("Ошибка ввода");
                continue;
            } else if (count - select <= 0) {
                if (turn) {
                    System.out.println("Победил первый игрок!");
                } else {
                    System.out.println("Победил второй игрок!");
                }
            }
            count -= select;
            System.out.println();
        }
    }

}