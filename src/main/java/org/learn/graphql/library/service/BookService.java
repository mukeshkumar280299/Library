package org.learn.graphql.library.service;

import org.learn.graphql.library.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();

    public Book getBookById(int bookId);
    public Book add(Book book);
    public List<Book> addListOfBooks(List<Book> bookList);
    public Book update(Book book, int bookId);
    public Book delete(int bookId);
}
