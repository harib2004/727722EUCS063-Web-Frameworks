package com.example.haribaskarcw2.Haribaskar_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.haribaskarcw2.model.Recipe;
import com.example.haribaskarcw2.service.RecipeService;

import java.util.*;ice;

import java.util.*;

@RestController
public classHaribaskar_RecipeServiceecipeController {
    @Autowired
    private RecipeService ser;
Haribaskar_Recipe> post(@RequestBody Haribaskar_Recipe person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/recipe/byname")
    public ResponseEntity<List<Haribaskar_Recipe>> getAllbyFiltering(@RequestParam("recipeName") String recipeName) {
        List<Haribaskar_Recipe> li = ser.filter(recipeName);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/recipe/{recipeId}")
    public ResponseEntity<Haribaskar_Recipe> getbyrecipeId(@PathVariable("recipeId") int recipeId) {
        Haribaskar_Recipeg("/api/recipe/{recipeId}")
    public ResponseEntity<Recipe> getbyrecipeId(@PathVariable("recipeId") int recipeId) {
        Recipe li = ser.getByid(recipeId);
        if (li!=null) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
