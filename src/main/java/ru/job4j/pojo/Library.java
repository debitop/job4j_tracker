package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Algorithms in Java", 100);
        Book book2 = new Book("Clean code", 400);
        Book book3 = new Book("Thinking in Java", 190);
        Book book4 = new Book("Effective Java", 120);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println();
        System.out.println("Replace books 0 and 3.");
        Book bookTest;
        bookTest = books[0];
        books[0] = books[3];
        books[3] = bookTest;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println();
        System.out.println("Shown only books \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}

