package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Library {
    @Value("${library.name}")
    private String libraryName;

    public void printLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}
