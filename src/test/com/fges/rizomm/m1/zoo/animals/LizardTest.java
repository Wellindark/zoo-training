package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LizardTest {

    @Test
    void when_animal_scream_then_string() {
        Lizard lizard = new Lizard();

        assertTrue(lizard.scream().matches(".*"));
        assertEquals("KAAAAAAAAAAA", lizard.scream());
        assertTrue(!lizard.scream().isEmpty());
        assertTrue(lizard.skeleton);
        lizard.toString();
    }
}