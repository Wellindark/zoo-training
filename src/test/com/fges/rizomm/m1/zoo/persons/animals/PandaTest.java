package com.fges.rizomm.m1.zoo.persons.animals;

import com.fges.rizomm.m1.zoo.animals.Panda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PandaTest {

    @Test
    void when_animal_scream_then_string() {
        Panda panda = new Panda();

        assertTrue(panda.scream().matches(".*"));
        assertEquals("ROAAAAAR", panda.scream());
        assertTrue(!panda.scream().isEmpty());
        assertTrue(panda.skeleton);

    }
}