package org.example;

import org.springframework.stereotype.Component;

@Component
public class BookService {
    public void listBooks() {
        System.out.println("Listing all books");
    }
}
