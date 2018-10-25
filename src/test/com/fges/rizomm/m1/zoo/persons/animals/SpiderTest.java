package com.fges.rizomm.m1.zoo.persons.animals;

import com.fges.rizomm.m1.zoo.animals.Spider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiderTest {

    @Test
    void when_animal_scream_then_string() {
        Spider spider = new Spider();

        assertTrue(spider.scream().matches(".*"));
        assertEquals("Ksss", spider.scream());
        assertTrue(!spider.scream().isEmpty());
        assertTrue(!spider.skeleton);

    }
}