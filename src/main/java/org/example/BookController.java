package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable("id") String bookId) {
        System.out.println("Book ID: " + bookId);
        return "bookDetails";
    }

    @RequestMapping("/books")
    public String getBooks() {
        return "books";
    }

    @GetMapping("/books")
    public String showBooks() {
        return "books"; // Returns view name "books"
    }

    @Autowired
    private BookService bookService;


    public void displayBooks() {
        bookService.listBooks();
    }
}
