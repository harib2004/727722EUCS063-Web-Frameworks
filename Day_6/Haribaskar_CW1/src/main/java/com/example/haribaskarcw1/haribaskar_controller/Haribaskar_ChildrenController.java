package com.example.haribaskarcw1.haribaskar_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
// import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw1.Haribaskar_model.Haribaskar_Children;
import com.example.haribaskarcw1.Haribaskar_service.Haribaskar_ChildrenService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Haribaskar_ChildrenController {

     @Autowired
     public Haribaskar_ChildrenService childrenService;

     @GetMapping("/api/children/sortBy/{babyFirstName}")
     public ResponseEntity<List<Haribaskar_Children>> sort(@PathVariable String babyFirstName) {
          List<Haribaskar_Children> child = childrenService.sort(babyFirstName);

          if (child.isEmpty()) {

               return new ResponseEntity<>(child, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<>(child, HttpStatus.OK);

     }

     // Pagination
     @GetMapping("api/children/{offset}/{pagesize}")
     public ResponseEntity<List<Haribaskar_Children>> pagination(@PathVariable int offset, @PathVariable int pagesize) {
          List<Haribaskar_Children> pages = childrenService.pagination(offset, pagesize);
          if (pages.isEmpty()) {
               return new ResponseEntity<List<Haribaskar_Children>>(pages, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<Haribaskar_Children>>(pages, HttpStatus.OK);
     }

     @GetMapping("/api/children/{offset}/{pagesize}/{field}")
     public ResponseEntity<List<Haribaskar_Children>> sortedPage(@PathVariable int offset, @PathVariable int pagesize,
               @PathVariable String field) {
          List<Haribaskar_Children> sortedPage = childrenService.sortedPage(offset, pagesize, field);
          if (sortedPage.isEmpty()) {

               return new ResponseEntity<>(sortedPage, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<>(sortedPage, HttpStatus.OK);
     }

     @PostMapping("/api/children")
     public ResponseEntity<Haribaskar_Children> postDetails(@RequestBody Haribaskar_Children children) {

          return new ResponseEntity<Haribaskar_Children>(childrenService.save(children), HttpStatus.CREATED);
     }

}