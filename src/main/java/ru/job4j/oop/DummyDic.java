package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String word = "\"Неизвестное слово. \" + eng";
        return word;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String say = dic.engToRus();
        System.out.println(say);
    }
}
