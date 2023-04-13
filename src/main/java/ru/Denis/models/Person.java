package ru.Denis.models;

public class Person {
    private String fullName;
    private String yearOfBorn;

    private final int id;

    public Person(String fullName, String yearOfBorn, int id) {
        this.fullName = fullName;
        this.yearOfBorn = yearOfBorn;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getYearOfBorn() {
        return yearOfBorn;
    }

    public void setYearOfBorn(String yearOfBorn) {
        this.yearOfBorn = yearOfBorn;
    }

    public int getId() {
        return id;
    }
}
