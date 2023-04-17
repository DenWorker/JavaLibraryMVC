package ru.Denis.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

public class Book {
    @Size(min = 2, max = 40, message = "Размер названия книги: от 2 до 30!")
    private String title;
    @Size(min = 2, max = 40, message = "Размер ФИО автора: от 2 до 30!")
    private String author;

    @Max(value = 2023, message = "Год издания не может быть больше 2023 года!")
    private int releaseDate;

    private int book_id;


    public Book() {
    }

    public Book(String title, String author, int releaseDate, int book_id) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.book_id = book_id;
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

}