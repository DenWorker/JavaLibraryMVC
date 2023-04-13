package ru.Denis.models;

public class Person {
    private String fullName;
    private String yearOfBorn;
    private int person_id;

    public Person() {
    }

    public Person(String fullName, String yearOfBorn, int person_id) {
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

    public String getYearOfBorn() {
        return yearOfBorn;
    }

    public void setYearOfBorn(String yearOfBorn) {
        this.yearOfBorn = yearOfBorn;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }
}
