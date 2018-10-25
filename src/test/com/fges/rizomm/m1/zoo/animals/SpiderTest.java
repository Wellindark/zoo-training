package com.fges.rizomm.m1.zoo.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SpiderTest {

    @Test
    void when_animal_scream_then_string() {
        Spider spider = new Spider();

        assertTrue(spider.scream().matches(".*"));
        assertEquals("Ksss", spider.scream());
        assertTrue(!spider.scream().isEmpty());
        assertTrue(!spider.skeleton);
        spider.toString();
    }
}