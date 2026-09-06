package bookstore.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bookstore.bookstore.domain.Book;
import bookstore.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demoData(BookRepository repository) {
		return (args) -> {
			repository.save(new Book("A Game of Thrones", "George R. R. Martin", 1996, "978-0553103540", 12.90));
			repository.save(new Book("Dune", "Frank Herbert", 1965, "978-0441172719", 9.50));
		};
	}
}