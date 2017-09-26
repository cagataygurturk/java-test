package com.example.assessment;

import com.example.assessment.model.Author;
import com.example.assessment.model.Book;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class BookServiceTest {

    private IBookService getBookService() {
        //TODO Read CSV file here
        return new BookService(null);
    }

    @Test
    public void listBooks() throws Exception {
        IBookService bookService = getBookService();
        final List<Book> bookList = bookService.listBooks();
        assertFalse(bookList.isEmpty());
        for (Book book : bookList) {
            assertFalse(book.getAuthors().isEmpty());
            for (Author author : book.getAuthors()) {
                assertNotNull(author.getEmail());
            }
            assertNotNull(book.getTitle());
            assertNotNull(book.getDescription());
            assertNotNull(book.getIsbn());
        }
    }

    @Test
    public void sortBooks() throws Exception {
        IBookService bookService = getBookService();
        List<Book> bookList = bookService.listBooksSorted();
        assertFalse(bookList.isEmpty());
        Book previousBook = null;
        for (Book currentBook : bookList) {
            if (previousBook != null) {
                assertTrue(currentBook.getTitle().compareTo(previousBook.getTitle()) > 0);
            }
            previousBook = currentBook;
        }
    }
}