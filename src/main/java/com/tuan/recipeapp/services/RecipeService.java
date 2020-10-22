package com.tuan.recipeapp.services;

import com.tuan.recipeapp.models.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
