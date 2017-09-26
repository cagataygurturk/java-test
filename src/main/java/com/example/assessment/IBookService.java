package com.example.assessment;

import com.example.assessment.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> listBooks();

    List<Book> listBooksSorted();
}
