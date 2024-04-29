package com.example.haribaskarcw1.Haribaskar_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Author;
import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Book;
import com.example.haribaskarcw1.Haribaskar_service.Haribaskar_AuthorService;
import com.example.haribaskarcw1.Haribaskar_service.BookService;

@RestController
public class Haribaskar_AuthorController {
    @Autowired
    private Haribaskar_AuthorService authorService;
@Autowired
private BookService bookService;
    @PostMapping("/author")
    public ResponseEntity<Haribaskar_Author> createAuthor(@RequestBody Haribaskar_Author author) {
        Haribaskar_Author savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<Haribaskar_Book> createBookForAuthor(@PathVariable Long authorId, @RequestBody Haribaskar_Book book) {
        Haribaskar_Book savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<Haribaskar_Author> getAuthorById(@PathVariable Long authorId) {
        Haribaskar_Author author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<Haribaskar_Author>> getAllAuthors() {
        List<Haribaskar_Author> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<Haribaskar_Author> updateAuthor(@PathVariable Long authorId, @RequestBody Haribaskar_Author author) {
        Haribaskar_Author updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
