package com.company;

import java.util.Collections;
import java.util.List;

public class BandMember extends Student {
    //Create a class Band Member which inherits from Student, and has 2
    //additional properties: instruments (which should be a String ArrayList), and minimum NumberOfPractice Hours

    private List<String> instruments;
    private int minimumNumberOfPracticeHours;


    public BandMember(String name, String idNumber, String instruments, int minimumNumberOfPracticeHours) {
        super(name, idNumber);
        this.instruments = Collections.singletonList(instruments);
        this.minimumNumberOfPracticeHours = minimumNumberOfPracticeHours;
    }

    @Override
    public void showStudent() {
        super.showStudent();
        System.out.println("Band member: " + getName() + ". Student instruments played: " + instruments + ". Min number" +
                " of hours: " + minimumNumberOfPracticeHours);
    }
}

