package org.learn.graphql.library;

import org.learn.graphql.library.entity.Book;
import org.learn.graphql.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LibraryApplication /*implements CommandLineRunner*/ {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	/*@Override
	public void  run(String... args) throws Exception {

		List<Book> books = new ArrayList<>();
		books.add(new Book ("The Hobbit", "J.R.R. Tolkien",  5, true ));
		books.add(new Book ("The Lord of the Rings: The Fellowship of the Ring", "J.R.R. Tolkien", 3, false ));
		books.add(new Book ("The Lord of the Rings: The Two Towers", "J.R.R. Tolkien",  2, true ));
		books.add(new Book ("The Lord of the Rings: The Return of the King", "J.R.R. Tolkien",  1,  true ));
		books.add(new Book ( "1984",  "George Orwell",  4,  true ));
		books.add(new Book ( "Animal Farm",  "George Orwell",  2,  false ));

		Book b1 = new Book ("The Great Wall", "Tolkien",  8, true );

		Book b2 = new Book();
		b2.setTitle("The Fellowship of the Ring");
		b2.setAuthor("J.R.R Murgon");
		b2.setQuantity(4);
		b2.setAvailable(true);

		this.bookService.add(b1);
		this.bookService.add(b2);

		this.bookService.addListOfBooks(books);
	}*/

}
