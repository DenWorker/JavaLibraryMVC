package ru.Denis.models;

public class Person {
    private String fullName;
    private int yearOfBorn;
    private int person_id;

    public Person() {
    }

    public Person(String fullName, int yearOfBorn, int person_id) {
        this.fullName = fullName;
        this.yearOfBorn = yearOfBorn;
        this.person_id = person_id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBorn() {
        return yearOfBorn;
    }

    public void setYearOfBorn(int yearOfBorn) {
        this.yearOfBorn = yearOfBorn;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }
}
