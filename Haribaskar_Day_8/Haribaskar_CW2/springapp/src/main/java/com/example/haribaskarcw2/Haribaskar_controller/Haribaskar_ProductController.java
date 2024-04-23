package com.example.haribaskarcw2.Haribaskar_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw2.Haribaskar_model.Haribaskar_Product;
import com.example.haribaskarcw2.Haribaskar_service.Haribaskar_ProductService;

import java.util.*;

@RestController
public class Haribaskar_ProductController {
    @Autowired
    private Haribaskar_ProductService ser;

    @PostMapping("/product")
    public ResponseEntity<Haribaskar_Product> post(@RequestBody Haribaskar_Product person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/product/distinct/startwith/{name}")
    public ResponseEntity<List<Haribaskar_Product>> getAll(@PathVariable("name") String name) {
        List<Haribaskar_Product> li = ser.start(name);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("product/distict/endswith/{name}")
    public ResponseEntity<List<Haribaskar_Product>> getbyAge(@PathVariable("name") String name) {
        List<Haribaskar_Product> li = ser.end(name);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/product/sortBy/price")
    public ResponseEntity<List<Haribaskar_Product>> getbyge() {
        List<Haribaskar_Product> li = ser.sort();
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
