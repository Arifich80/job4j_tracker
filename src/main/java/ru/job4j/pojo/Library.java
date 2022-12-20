package ru.job4j.pojo;

public class Library {
    @SuppressWarnings("checkstyle:MethodParamPad")
    public static void main(String[] args) {
        Book idiot = new Book("Идиот", 500);
        Book warAndPeace = new Book("Война и мир", 5000);
        Book cleanCode = new Book("Clean code", 300);
        Book bible = new Book("Библия", 100);
        Book[] books = new Book[4];
        books[0] = idiot;
        books[1] = warAndPeace;
        books[2] = cleanCode;
        books[3] = bible;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages() + " " + "страниц.");
        }
            String str = " ";
            System.out.println(str);

        System.out.println("Replace index 0 and 3:");
        books[0] = bible;
        books[3] = idiot;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages() + " " + "страниц.");

        }
        String str1 = " ";
        System.out.println(str1);
        System.out.println("Shown only Clean code:");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName() == "Clean code") {
                System.out.println(bk.getName() + " - " + bk.getPages() + " " + "страниц.");
            }
        }
    }
}