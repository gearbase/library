package com.library.homework6.dao;

import com.library.homework6.domain.Book;

import java.util.List;

public interface BookDAO {
    Long count();
    void insert(Book book);
    Book getById(Long bookId);
    Book getBookByName(String bookName, Long authorId);
    List<Book> getAllBooks();
    void deleteBook(Long bookId);
    void update(String bookName, String newBookName, Long authorId);
}
