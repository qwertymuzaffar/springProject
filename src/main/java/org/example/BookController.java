package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    @GetMapping("/books")
    public String showBooks() {
        return "books"; // Returns view name "books"
    }
}
