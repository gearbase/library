package com.library.homework6.dao;

import com.library.homework6.domain.Author;

import java.util.List;

public interface AuthorDAO {
    Long count();
    void insert(Author author);
    Author getById(Long authorId);
    Author getAuthorByName(String authorName);
    List<Author> getAllAuthors();
    void deleteAuthor(Long authorId);
    void update(Author oldAuthor, String newAuthorName);
}
