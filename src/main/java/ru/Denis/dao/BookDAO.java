package ru.Denis.dao;

import ru.Denis.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.Denis.models.Person;

import java.util.List;

@Component
public class BookDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> index() {
        return jdbcTemplate.query("SELECT * FROM books", new BeanPropertyRowMapper<>(Book.class));
    }

    public void save(Book book) {
        jdbcTemplate.update("INSERT INTO books(title, author, releaseDate) VALUES (?,?,?)",
                book.getTitle(), book.getAuthor(), book.getReleaseDate());
    }

    public Book show(int id) {
        return jdbcTemplate.query("SELECT * FROM books WHERE book_id = ?", new Object[]{id},
                new BeanPropertyRowMapper<>(Book.class)).stream().findFirst().orElse(null);
    }

    public String showPersonOfBook(int id) {
        List<Person> result = jdbcTemplate.query("SELECT * from books INNER JOIN people on people.person_id = books.person_id WHERE book_id = ?;",
                new Object[]{id}, new BeanPropertyRowMapper<>(Person.class));

        return (result.isEmpty()) ? (null) : (result.get(0).getFullName());
    }


    public void update(Book book, int id) {
        jdbcTemplate.update("UPDATE books SET title = ?, author = ?, releasedate = ? WHERE book_id = ?",
                book.getTitle(), book.getAuthor(), book.getReleaseDate(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM books WHERE book_id = ?", id);
    }

    public void toFree(int id) {
        jdbcTemplate.update("UPDATE books SET person_id = null WHERE book_id = ?", id);
    }

}