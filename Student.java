package com.more.classes;

public class Student {
    private String studentName;
    private long studentNumber;

    public Student(String studentName, long studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public Student (Student student)
    {
        this.studentName =  student.studentName;
        this.studentNumber = student.studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student Information: \n" +
                "studentName: " + studentName + "\n" +
                ", studentNumber=" + studentNumber ;
    }

    public boolean equals(Student object)
    {
        if (this.studentNumber == object.studentNumber && this.studentName.equals(object.studentName))
        {
            return true;
        }
        else
        {
            return false;
        }





    }
}

