package com.company.max;

public class Student implements StudentInterface{
    public String name;
    public String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void Speak() {
        System.out.println("Hi! Im Student");
    }

    public void Read() {
        System.out.println("I can write");
    }

    public void Write() {
        System.out.println("I can Write");
    }

    public String toString() {
        return "\tStudent\n\t\t " +
                "name " + name +
                " department " + department;
    }
}
