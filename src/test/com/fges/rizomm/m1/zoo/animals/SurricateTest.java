package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SurricateTest {

    @Test
    void when_animal_scream_then_string() {
        Surricate surricate = new Surricate();

        assertTrue(surricate.scream().matches(".*"));
        assertEquals("Kikikiki", surricate.scream());
        assertTrue(!surricate.scream().isEmpty());
        assertTrue(surricate.skeleton);
        surricate.toString();
    }
}