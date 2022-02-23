package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Ошибка найдена " + active);
        System.out.println("В строке " + status);
        System.out.println("Название ошибки " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(true, 15, "IOException");
        error1.printInfo();
        Error error2 = new Error(false, 10, "ошибок не найдено");
        error2.printInfo();
    }
}
