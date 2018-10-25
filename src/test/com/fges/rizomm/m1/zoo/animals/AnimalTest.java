package com.fges.rizomm.m1.zoo.animals;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnimalTest {

    @Test
    void when_animal_scream_then_string() {
        Dog dog = new Dog();

        assertTrue(dog.scream().matches(".*"));
        assertEquals("Woof", dog.scream());
        assertTrue(!dog.scream().isEmpty());
        dog.toString();

    }

    @Test
    void eat() {
        Animal dog=new Dog();

    }
}