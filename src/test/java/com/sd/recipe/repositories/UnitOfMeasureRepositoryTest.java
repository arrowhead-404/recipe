package com.sd.recipe.repositories;

import com.sd.recipe.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryTest {

    @Autowired
    UnitOfMeasureRepository repository;

    @Before
    public void setup(){

    }

    @Test
    public void findByDescription() {

        Optional<UnitOfMeasure> uomOptional=repository.findByDescription("Teaspoon");

        assertEquals("Teaspoon", uomOptional.get().getDescription());

    }

    @Test
    public void findByDescriptionCup() {

        Optional<UnitOfMeasure> cupOptional=repository.findByDescription("Cup");

        assertEquals("Cup", cupOptional.get().getDescription());

    }
}