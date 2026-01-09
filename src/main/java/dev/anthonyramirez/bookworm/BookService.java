package dev.anthonyramirez.bookworm;

import org.springframework.stereotype.Service;


import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@NoArgsConstructor
public class BookService {
    private String author;
    private String title;

    public static void main(String[] args) {

    }
}