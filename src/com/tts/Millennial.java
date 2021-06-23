package com.tts;
import java.util.Scanner;

import java.lang.reflect.Member;

public class Millennial {

    //Some private instance variables
    private int Age;
    private String Jeans = "Skinny";
    private String Bangs = "Side bangs";
    private int StudentDebt;
    private String PoliticalParty = "Democractic";
    public String Name;

    //empty
    Millennial () {
    }


    //Method that returns String AND is a Boolean
    public boolean Age (int age) {
        int minimumAge = 24;
        int maximumAge = 40;
        boolean millennialAgeRange = age >= minimumAge && maximumAge <= age;
        if(millennialAgeRange == true) {
            this.Age = age;
            System.out.println("You're definitely a millennial!");
        } else {
            System.out.println("You're not a millennial!");
        }
        return true;
    }

    //A constructor that uses only 2 of my 3 variables
    public Millennial (int age, int studentDebt) {
        this.Age = age;
        this.StudentDebt = studentDebt;
    }

    //A constructor that uses 3 of my variables
    public Millennial (String bangs, String jeans, String politicalParty) {
        this.Bangs = bangs;
        this.Jeans = jeans;
        this.PoliticalParty = politicalParty;
    }


    //Getter and setters for all 5 of my variables
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getJeans() {
        return Jeans;
    }

    public void setJeans(String jeans) {
        Jeans = jeans;
    }

    public String getBangs() {
        return Bangs;
    }

    public void setBangs(String bangs) {
        Bangs = bangs;
    }

    public int getStudentDebt() {
        return StudentDebt;
    }

    public void setStudentDebt(int studentDebt) {
        StudentDebt = studentDebt;
    }

    public String getPoliticalParty() {
        return PoliticalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        PoliticalParty = politicalParty;
    }



    @Override
    public String toString() {
        return "Millennial {" +
                "Name=" + Name +
                ", Age=" + Age +
                ", Jeans='" + Jeans + '\'' +
                ", Bangs='" + Bangs + '\'' +
                ", StudentDebt=" + StudentDebt +
                ", PoliticalParty='" + PoliticalParty + '\'' +
                '}';
    }
}
