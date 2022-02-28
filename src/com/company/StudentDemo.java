package com.company;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {

    public static void main(String[] args) {
        // • Create a new project in IntelliJ named StudentInheritance
        //• Create a class Student which has (2) properties: name and idNumber
        //• Create a class Band Member which inherits from Student, and has 2
        //additional properties: instruments (which should be a String ArrayList), and minimum NumberOfPractice Hours
        //• Create appropriate constructors for Student and Band Member; be sure to call super() to initialize Student's properties
        //• Create a showStudent() method in Student which displays a Student's name and ID number;
        // override showStudent() in Band Member so that it displays a Student's name, instrument(s),
        // and number of required practice hours
        //• Rename your Main class to StudentDemo, instantiate a Student object and a
        //Band Member object, and call showStudent() on each method

        Student student = new Student("Collin", "12345678");
        BandMember bandMember = new BandMember("Ruqayyah", "25814763", "Piano, flute, guitar",
                7);
        BandMember bandMember1 = new BandMember("Elissa", "25891325", "Cello", 1000);

        student.showStudent();
        bandMember.showStudent();
        bandMember1.showStudent();
    }
}
