package com.example.haribaskarcw2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw2.Haribaskar_model.HaribaskarBook;
import com.example.haribaskarcw2.Haribaskar_service.HaribaskarBookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller", description = "null")
public class BookController {
    @Autowired
    HaribaskarBookService bookService;

    @PostMapping("/api/book")
    public HaribaskarBook addBook(@RequestBody HaribaskarBook book) {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public HaribaskarBook updateBook(@PathVariable int id, @RequestBody HaribaskarBook book) {
        return bookService.updateBook(id, book);
    }

    @GetMapping("/api/book")
    public List<HaribaskarBook> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<HaribaskarBook> getBook(@PathVariable int id) {
        return bookService.getBook(id);
    }
}
