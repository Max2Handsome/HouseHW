package com.company.max;

public class Master implements StudentInterface {
    public String name;
    public String department;
    public int stepends;

    public Master(String name, String department, int stepens) {
        this.name = name;
        this.department = department;
        this.stepends = stepens;
    }

    public void Speak() {
        System.out.println("Hi! Im Master");
    }

    public void Read() {
        System.out.println("I can read");
    }

    public void Write() {
        System.out.println("I can write");
    }

    public String toString() {
        return "\tMaster\n\t\t " +
                "name " + name +
                " department " + department +
                " stepens " + stepends;
    }
}
