package ru.Denis.models;

public class Book {
    private String title;
    private String author;
    private int releaseDate;

    private int book_id;

    private Integer person_id;

    public Book() {
    }

    public Book(String title, String author, int releaseDate, int book_id, Integer person_id) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.book_id = book_id;
        this.person_id = person_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }
}