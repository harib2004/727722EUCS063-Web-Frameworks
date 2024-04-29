package com.example.haribaskarcw1.Haribaskar_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Author;
import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Book;
import com.example.haribaskarcw1.Haribaskar_repository.Haribaskar_AuthorRepository;
import com.example.haribaskarcw1.Haribaskar_repository.Haribaskar_BookRepository;

@Service
public class BookService {
    @Autowired
    private Haribaskar_BookRepository bookRepository;
@Autowired
private Haribaskar_AuthorRepository authorRepository;
    public Haribaskar_Book saveBook(Long authorId, Haribaskar_Book book) {
        Haribaskar_Author author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public Haribaskar_Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

