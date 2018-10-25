package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SerpentTest {

    @Test
    void when_animal_scream_then_string() {
        Snake serpent = new Snake(Food.Meat);

        assertTrue(serpent.scream().matches(".*"));
        assertEquals("Hisssssssssssssss", serpent.scream());
        assertTrue(!serpent.scream().isEmpty());
        assertTrue(!serpent.skeleton);
        serpent.toString();
    }

}