package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setGroup("AB2");
        student.setFullName("Иванов Иван Иванович");
        student.setDateOfEntry("27-02-2022");
        System.out.println(student.getGroup());
        System.out.println(student.getFullName());
        System.out.println(student.getDateOfEntry());
    }
}
