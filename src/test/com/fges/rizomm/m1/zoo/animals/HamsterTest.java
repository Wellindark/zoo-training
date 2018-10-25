package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HamsterTest {

    @Test
    void when_animal_scream_then_string() {
        Hamster hamster = new Hamster();

        assertTrue(hamster.scream().matches(".*"));
        assertEquals("Krikrikrik", hamster.scream());
        assertTrue(!hamster.scream().isEmpty());
        assertTrue(hamster.skeleton);
        hamster.toString();
    }
}