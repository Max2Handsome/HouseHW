package com.company.max;

public class University {
    Student st;
    Master ms;

    public University(Student st, Master ms) {
        this.st = st;
        this.ms = ms;
    }

    @Override
    public String toString() {
        return "University \n" + st + "\n" + ms;
    }
}
