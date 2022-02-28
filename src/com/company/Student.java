package com.company;

public class Student {

    private String name;
    private String idNumber;

    public Student(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }
    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }
    public void showStudent() {
        System.out.println("Student name: " + name + ". ID Number: " + idNumber);
    }
}
