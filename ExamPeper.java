package com.more.classes;

//Agreegation in JAVA

public class ExamPeper {
    private Student student;
    private Subject subject;
    private int marks;

    public ExamPeper(Student student, Subject subject, int marks) {
        this.student = new Student(student);  //This is not the original variable that was passed in but a copy that exact same variable
        this.subject = new Subject(subject);  //This is the copy constructor
        this.marks = marks;
    }

    public Student getStudent() {
        return new Student(student);
    }

    public Subject getSubject() {
        return new Subject(subject);
    }

    public int getMarks() {
        return marks;
    }

    public void setStudent(Student student) {
        this.student =  new Student(student);
    }

    public void setSubject(Subject subject) {
        this.subject = new Subject(subject);
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Exam Paper" +
                "student=" + student +
                ", subject=" + subject +
                ", marks=" + marks ;

    }
}
