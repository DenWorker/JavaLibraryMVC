package ru.Denis.dao;

import org.springframework.jdbc.core.ResultSetExtractor;
import ru.Denis.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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
        return jdbcTemplate.queryForObject("SELECT people.fullname from books INNER JOIN people on people.person_id = books.person_id WHERE book_id = ?;",
                String.class, id);
    }


    public void update(Book book, int id) {
        jdbcTemplate.update("UPDATE books SET title = ?, author = ?, releasedate = ? WHERE book_id = ?",
                book.getTitle(), book.getAuthor(), book.getReleaseDate(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM books WHERE book_id = ?", id);
    }

}