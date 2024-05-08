package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sergey Maslovsky");
        student.setGroup(311);
        student.setReceipt(new Date());
        System.out.println(student.getName() + " поступил " + student.getReceipt()
                           + " в группу " + student.getGroup());
    }
}
