package com.example.assessment.model;


import java.util.Collections;
import java.util.List;

public final class Book {

    private Book() {
    }

    private String isbn;

    private String title;

    private String description;

    private String authors;

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<Author> getAuthors() {
        //TODO implement
        return Collections.emptyList();
    }
}
