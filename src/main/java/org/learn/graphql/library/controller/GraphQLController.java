package org.learn.graphql.library.controller;

import org.learn.graphql.library.entity.Book;
import org.learn.graphql.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphQLController {

    @Autowired
    private BookService bookService;
    @QueryMapping("listBooks")
    public List<Book> listBook(){
        return bookService.getAllBooks();
    }
    @QueryMapping("getBook")
    public Book getBook(@Argument int bookId) {
        return bookService.getBookById(bookId);
    }

    @MutationMapping("addBook")
    public Book addBook(@Argument("book") Book book) {
        return bookService.add(book);
    }

    @MutationMapping("updateBook")
    public Book updateBook(@Argument Book book, @Argument int bookId) throws Exception {
        if (book == null)
            throw new Exception("Invalid Request Data for Update...");
        return bookService.update(book, bookId);
    }

    @MutationMapping("deleteBook")
    public Book deleteBook(@Argument int bookId) {
        return bookService.delete(bookId);
    }
}

