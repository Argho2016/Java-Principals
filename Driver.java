package com.more.classes;

public class Driver {
    public static void main(String[] args) {
        Subject subject1 = new Subject("TP1", "Technical Programming");
        Subject subject2 = new Subject("TP1", "Technical Programming");

        if (subject1.equals(subject2))
            System.out.println("They are the same");

        System.out.println(subject1);

        Student student1 = new Student("Chuck" ,458 );

        ExamPeper peper = new ExamPeper(student1, subject1, 100);

        System.out.println(peper);
    }
}
