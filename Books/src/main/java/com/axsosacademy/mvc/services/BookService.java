package com.axsosacademy.mvc.services;

import com.axsosacademy.mvc.models.Book;
import com.axsosacademy.mvc.repositories.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book findBook(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Transactional
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            Book bookToUpdate = optionalBook.get();
            bookToUpdate.setTitle(title);
            bookToUpdate.setDescription(desc);
            bookToUpdate.setLanguage(lang);
            bookToUpdate.setNumberOfPages(numOfPages);
            return bookRepository.save(bookToUpdate);
        } else {
            return null;
        }
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);  
    }



}