package com.fges.rizomm.m1.zoo.persons.animals;

import com.fges.rizomm.m1.zoo.animals.Hamster;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamsterTest {

    @Test
    void when_animal_scream_then_string() {
        Hamster hamster = new Hamster();

        assertTrue(hamster.scream().matches(".*"));
        assertEquals("Krikrikrik", hamster.scream());
        assertTrue(!hamster.scream().isEmpty());
        assertTrue(hamster.skeleton);

    }
}