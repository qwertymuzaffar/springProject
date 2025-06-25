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
}
