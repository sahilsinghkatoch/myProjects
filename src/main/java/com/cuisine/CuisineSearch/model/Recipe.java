package com.cuisine.CuisineSearch.model;

import java.util.List;

public class Recipe {
	
	public Recipe(){}
	
	public Recipe(String recipeName, List<String> recipeLabels) {
		super();
		this.recipeName = recipeName;
		this.recipeLabels = recipeLabels;
	}	
	
	private String recipeName;
	private List<String> recipeLabels;
	
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public List<String> getRecipeLabels() {
		return recipeLabels;
	}
	public void setRecipeLabels(List<String> recipeLabels) {
		this.recipeLabels = recipeLabels;
	}

}
