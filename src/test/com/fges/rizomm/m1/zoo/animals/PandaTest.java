package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PandaTest {

    @Test
    void when_animal_scream_then_string() {
        Panda panda = new Panda();

        assertTrue(panda.scream().matches(".*"));
        assertEquals("ROAAAAAR", panda.scream());
        assertTrue(!panda.scream().isEmpty());
        assertTrue(panda.skeleton);
        panda.toString();
    }
}