package org.example;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@RestController
public class BookRestController {
    @GetMapping("/api/books")
    public List<String> getAllBooks() {
        return Arrays.asList("Spring Boot", "Spring Cloud");
    }

    @GetMapping("/api/book")
    public String getBookByTitle(@RequestParam("title") String title) {
        return "Book title: " + title;
    }

    @GetMapping("/api/message")
    @ResponseBody
    public String getMessage() {
        return "Hello, Spring!";
    }
}
