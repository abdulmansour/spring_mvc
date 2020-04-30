package com.abdulmansour.model;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteCodingLanguage;
    private ArrayList<String> operatingSystems;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteCodingLanguage() {
        return favoriteCodingLanguage;
    }

    public void setFavoriteCodingLanguage(String favoriteCodingLanguage) {
        this.favoriteCodingLanguage = favoriteCodingLanguage;
    }

    public ArrayList<String> getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(ArrayList<String> operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
