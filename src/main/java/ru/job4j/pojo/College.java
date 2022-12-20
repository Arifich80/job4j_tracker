package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullLegalName("Petr Arsentev");
        student.setGroup(101);
        student.setDateOfAdmission("10.09.2022");

        System.out.println(student.getFullLegalName() + " has joined group № " + student.getGroup() + " in " + student.getDateOfAdmission());
    }
}

