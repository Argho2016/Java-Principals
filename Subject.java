package com.more.classes;

import java.util.Objects;

public class Subject {
    private  String subjectCode;
    private String subjectName;

    public Subject(String subjectCode, String subjectName)
    {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public Subject (Subject subject)
    {
        this.subjectName = subject.subjectName;
        this.subjectCode = subject.subjectCode;
    }

    public  boolean equals (Subject object)   //Object was passed in
    {
        if (this.subjectName.equals(object.subjectName) &&
        this.subjectCode.equals(object.subjectCode))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    //tostring is a method that describes your object
    public String toString(){  //Used to stop printing hash values
        return "Subject information: \n" + "Subject Code: " +
                subjectCode + "\n" + "SUbject name: " + subjectName;
    }
}
