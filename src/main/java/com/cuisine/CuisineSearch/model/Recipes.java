package com.cuisine.CuisineSearch.model;

import java.util.ArrayList;
import java.util.List;

public class Recipes {
	
	private List<Recipe> recipeList;

	public List<Recipe> getRecipeList() {
		if(recipeList == null) {
			recipeList = new ArrayList<>();
        }
		return recipeList;
	}

	public void setRecipeList(List<Recipe> recipeList) {
		this.recipeList = recipeList;
	}
	
	

}
