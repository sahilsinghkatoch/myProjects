package com.cuisine.CuisineSearch.dao;

import java.util.Arrays;

import org.springframework.stereotype.Repository;

import com.cuisine.CuisineSearch.model.Recipe;
import com.cuisine.CuisineSearch.model.Recipes;

@Repository
public class CuisineDAO {
	
private static Recipes list = new Recipes();
    
    static 
    {
    	list.getRecipeList().add(new Recipe("Soya-Chap", Arrays.asList("Protein", "Snacks", "QuickRecipe")));
    	list.getRecipeList().add(new Recipe("Mango-shake", Arrays.asList("Nutritious", "Refreshing", "Healthy")));
    	list.getRecipeList().add(new Recipe("Maggie", Arrays.asList("ReadyToEat", "Hostel", "QuickRecipe")));

    }
    
    public Recipes getAllRecipes() 
    {
        return list;
    }
    
    public void addEmployee(Recipe recipe) {
        list.getRecipeList().add(recipe);
    }

}
