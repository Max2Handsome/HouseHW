package com.company.max;

public class Main {
    public static void main(String[] args) {
        Student st = new Student("Anton","CS" );
        Master ms = new Master("Grigo", "CS", 5000);
        University u1 = new University(st,ms);
        System.out.println(u1);
    }
}
