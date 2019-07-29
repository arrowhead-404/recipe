package com.sd.recipe.service;


import com.sd.recipe.domain.Recipe;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */

public interface RecipeService {

    Set<Recipe> getRecipes();
}