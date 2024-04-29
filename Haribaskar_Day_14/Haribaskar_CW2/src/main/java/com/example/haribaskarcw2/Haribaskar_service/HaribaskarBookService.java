package com.example.haribaskarcw2.Haribaskar_service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.haribaskarcw2.Haribaskar_model.HaribaskarBook;
import com.example.haribaskarcw2.Haribaskar_repository.HaribaskarBookRepo;

@Service
public class HaribaskarBookService {
     @Autowired
     HaribaskarBookRepo bookRepo;

     public HaribaskarBook addBook(HaribaskarBook book) {
          return bookRepo.save(book);
     }

     public List<HaribaskarBook> getBooks() {
          return bookRepo.findAll();
     }

     public Optional<HaribaskarBook> getBook(int id) {
          return bookRepo.findById(id);
     }

     public HaribaskarBook updateBook(int id, HaribaskarBook book) {
          HaribaskarBook avail = bookRepo.findById(id).orElse(null);
          if (avail != null) {
               avail.setAuthor(book.getAuthor());
               avail.setAvailableCopies(book.getAvailableCopies());
               avail.setTitle(book.getTitle());
               avail.setTotalCopies(book.getTotalCopies());
               return bookRepo.save(avail);
          } else
               return null;
     }
}
