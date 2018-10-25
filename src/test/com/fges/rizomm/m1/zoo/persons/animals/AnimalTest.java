package com.fges.rizomm.m1.zoo.persons.animals;


import com.fges.rizomm.m1.zoo.animals.Animal;
import com.fges.rizomm.m1.zoo.animals.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void when_animal_scream_then_string() {
        Dog dog = new Dog();

        assertTrue(dog.scream().matches(".*"));
        assertEquals("Woof", dog.scream());
        assertTrue(!dog.scream().isEmpty());


    }

    @Test
    void eat() {
        Animal dog=new Dog();

    }
}