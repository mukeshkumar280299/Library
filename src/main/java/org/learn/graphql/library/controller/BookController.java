package org.learn.graphql.library.controller;

import org.learn.graphql.library.entity.Book;
import org.learn.graphql.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        return bookService.add(book);
    }

    @GetMapping("/book/list")
    public List<Book> listBook(){
        return bookService.getAllBooks();
    }

    @PostMapping("/book/list")
    public List<Book> addListOfBook(@RequestBody List<Book> bookList) {
        return bookService.addListOfBooks(bookList);
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") int bookId) {
        return bookService.getBookById(bookId);
    }

    @PostMapping("/update/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable("id") int bookId) throws Exception {
        if (book == null)
            throw new Exception("Invalid Request Data for Update...");
        return bookService.update(book, bookId);
    }

    @PostMapping("delete/{id}")
    public Book deleteBook(@PathVariable("id") int bookId) {
        return bookService.delete(bookId);
    }
}
