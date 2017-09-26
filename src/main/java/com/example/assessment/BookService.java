package com.example.assessment;

import com.example.assessment.model.Book;

import java.io.InputStream;
import java.util.List;

public class BookService implements IBookService {

    private final InputStream csvInput;

    public BookService(InputStream csvInput) {
        this.csvInput = csvInput;
    }

    @Override
    public List<Book> listBooks() {
        //TODO Implement
        throw new RuntimeException("Not implemented");
    }

    @Override
    public List<Book> listBooksSorted() {
        //TODO Implement
        throw new RuntimeException("Not implemented");
    }
}
