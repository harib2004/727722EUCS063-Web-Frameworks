package com.example.haribaskarcw1.Haribaskar_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Author;
import com.example.haribaskarcw1.Haribaskar_repository.Haribaskar_AuthorRepository;

@Service
public class Haribaskar_AuthorService {
    @Autowired
    private Haribaskar_AuthorRepository authorRepository;

    public Haribaskar_Author saveAuthor(Haribaskar_Author author) {
        return authorRepository.save(author);
    }

    public Haribaskar_Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<Haribaskar_Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Haribaskar_Author updateAuthor(Long id, Haribaskar_Author author) {
        Haribaskar_Author existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
