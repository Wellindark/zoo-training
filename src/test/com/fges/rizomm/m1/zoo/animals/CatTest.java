package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CatTest {

    @Test
    void when_animal_scream_then_string() {
        Cat cat = new Cat();

        assertTrue(cat.scream().matches(".*"));
        assertEquals("Miaou", cat.scream());
        assertTrue(!cat.scream().isEmpty());
        assertTrue(cat.skeleton);
        cat.toString();
    }
}