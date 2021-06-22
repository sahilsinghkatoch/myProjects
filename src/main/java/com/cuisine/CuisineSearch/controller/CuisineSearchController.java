package com.cuisine.CuisineSearch.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cuisine.CuisineSearch.dao.CuisineDAO;
import com.cuisine.CuisineSearch.model.Recipes;
import com.cuisine.CuisineSearch.service.CuisineService;


@RestController
@RequestMapping(path = "/recipe")
public class CuisineSearchController {
	
	@Autowired
    private CuisineDAO cuisineDao;
	
	@GetMapping(path="/", produces = "application/json")
    public ResponseEntity<String> getCuisines
    (
    		@RequestParam String cuisineType,
    		@RequestParam String city
    ) 
    {
    	CuisineService cs = new CuisineService();
    	
        return cs.getRecipes(cuisineType, city);
    }
    
    @GetMapping(path="/hardCodedRecipes", produces = "application/json")
    public Recipes getCuisines
    (
    		
    ) 
    {	
        return cuisineDao.getAllRecipes();
    }
    
    

}
