package dev.anthonyramirez.bookworm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import dev.anthonyramirez.bookworm.repositories.BookRepository;

@SpringBootApplication
public class BookwormApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookwormApplication.class, args);
	}

}
