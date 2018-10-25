package com.fges.rizomm.m1.zoo.persons.animals;

import com.fges.rizomm.m1.zoo.animals.Food;
import com.fges.rizomm.m1.zoo.animals.Snake;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerpentTest {

    @Test
    void when_animal_scream_then_string() {
        Snake serpent = new Snake(Food.Meat);

        assertTrue(serpent.scream().matches(".*"));
        assertEquals("Hisssssssssssssss", serpent.scream());
        assertTrue(!serpent.scream().isEmpty());
        assertTrue(!serpent.skeleton);

    }
}