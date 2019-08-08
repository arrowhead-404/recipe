package com.sd.recipe.service;

import com.sd.recipe.domain.Recipe;
import com.sd.recipe.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService=new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipes() {

        Set<Recipe> rs=new HashSet<>();
        Recipe mockRecipe=new Recipe();
        rs.add(mockRecipe);

        when(recipeRepository.findAll()).thenReturn(rs);

        Set<Recipe> recipes=recipeService.getRecipes();
        assertEquals(recipes.size(), 1);

        verify(recipeRepository, times(1)).findAll();
    }
}