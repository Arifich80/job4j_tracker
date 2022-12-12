package oop;

public class DummyDic {
    public String engToRus(String eng) {
        String word = "eng";
        return word;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String say = dic.engToRus("eng");
        System.out.println("Неизвестное слово. " + say);
    }
}
