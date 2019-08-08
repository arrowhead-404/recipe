package com.sd.recipe.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp()
    {
        category=new Category();
    }

    @Test
    public void getId() {
        Long val=4l;
        category.setId(val);
        assertEquals(val, category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}