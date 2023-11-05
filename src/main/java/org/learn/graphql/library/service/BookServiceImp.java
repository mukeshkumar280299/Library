package org.learn.graphql.library.service;

import org.learn.graphql.library.entity.Book;
import org.learn.graphql.library.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImp implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(int bookId) {
        Optional<Book> fetechBookData = bookRepository.findById(bookId);
        if (fetechBookData.isEmpty())
            throw new RuntimeException("BookId does not exist");
        return fetechBookData.get();
    }

    @Override
    public Book add(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> addListOfBooks(List<Book> bookList) {
        return bookRepository.saveAll(bookList);
    }

    @Override
    public Book update(Book book, int bookId) {
        Optional<Book> fetechBookData = bookRepository.findById(bookId);
        if (fetechBookData.isEmpty())
            throw new RuntimeException("BookId does not exist");
        Book getBookData = fetechBookData.get();
        if (book.getTitle() != null && !book.getTitle().isBlank())
            getBookData.setTitle(book.getTitle());
        if (book.getAuthor() != null && !book.getAuthor().isBlank())
            getBookData.setAuthor(book.getAuthor());
        getBookData.setQuantity(book.getQuantity());
        getBookData.setAvailable(book.isAvailable());
        return bookRepository.save(getBookData);
    }

    @Override
    public Book delete(int bookId) {
        Optional<Book> fetechBookData = bookRepository.findById(bookId);
        if (fetechBookData.isEmpty())
            throw new RuntimeException("Book does not exist");
        Book getBookData = fetechBookData.get();
        bookRepository.delete(getBookData);
        return getBookData;
    }
}
