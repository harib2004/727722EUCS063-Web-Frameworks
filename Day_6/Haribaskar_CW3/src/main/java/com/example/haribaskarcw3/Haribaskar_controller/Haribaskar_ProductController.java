package com.example.haribaskarcw3.Haribaskar_controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw3.Haribaskar_model.Haribaskar_Product;
import com.example.haribaskarcw3.Haribaskar_service.Haribaskar_ProductService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class Haribaskar_ProductController {
    public Haribaskar_ProductService productService;
    public Haribaskar_ProductController(Haribaskar_ProductService productService)
    {
        this.productService = productService;
    }
    @PostMapping("/api/product")
    public ResponseEntity<Haribaskar_Product> postMethodName(@RequestBody Haribaskar_Product product) {
        if(productService.postProduct(product))
        {
            return new ResponseEntity<>(product,HttpStatus.CREATED);
        }
        
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/product/{offset}/{pagesize}")
    public ResponseEntity<List<Haribaskar_Product>> getMethodName(@PathVariable("offset") int offset,@PathVariable("pagesize") int size) {
        List<Haribaskar_Product> list = productService.pagination(offset,size);
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/api/product/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<Haribaskar_Product>> getSortedPagination(@PathVariable("offset") int offset,@PathVariable("pagesize") int size,@PathVariable("field") String field) {
        List<Haribaskar_Product> list = productService.sortPagination(offset,size,field);
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/api/product/{productId}")
    public ResponseEntity<Haribaskar_Product> getMethodName(@PathVariable("productId") int id) {
        Haribaskar_Product product = productService.getProductById(id);
        if(product==null)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
    
    
}
