package com.fges.rizomm.m1.zoo.persons.animals;

import com.fges.rizomm.m1.zoo.animals.Lizard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LizardTest {

    @Test
    void when_animal_scream_then_string() {
        Lizard lizard = new Lizard();

        assertTrue(lizard.scream().matches(".*"));
        assertEquals("KAAAAAAAAAAA", lizard.scream());
        assertTrue(!lizard.scream().isEmpty());
        assertTrue(lizard.skeleton);

    }
}