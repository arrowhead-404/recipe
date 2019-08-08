package com.sd.recipe.controllers;

import com.sd.recipe.domain.Recipe;
import com.sd.recipe.repositories.RecipeRepository;
import com.sd.recipe.service.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    IndexController indexController;

    @Mock
    Model model;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        indexController=new IndexController(recipeService);
    }

    @Test
    public void getIndexPage() {

        Set<Recipe> mocks=new HashSet<>();
        mocks.add(new Recipe());
        when(recipeService.getRecipes()).thenReturn(mocks);

        assertEquals(indexController.getIndexPage(model),"index");

        verify(recipeService,times(1)).getRecipes();
        verify(model,times(1)).addAttribute(eq("recipes"), anySet());
    }
}