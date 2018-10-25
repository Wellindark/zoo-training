package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Food;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalKeeperTest {

    @Test
    void test_AK_meat() {
        MeatAK meatAK = new MeatAK();
        assertSame(meatAK.canGive, Food.Meat);
    }

    @Test
    void test_AK_insects() {
        InsectAK insectAK = new InsectAK();
        assertSame(insectAK.canGive, Food.Insects);
    }

    @Test
    void test_AK_herbs() {
        HerbAK herbAK = new HerbAK();
        assertSame(herbAK.canGive, Food.Vegetables);
    }

    @Test
    void test_AK_bamboo() {
        BambooAK bambooAK = new BambooAK();
        assertSame(bambooAK.canGive, Food.Bamboo);
    }

    @Test
    void test_AK_seeds() {
        SeedsAK seedsAK = new SeedsAK();
        assertSame(seedsAK.canGive, Food.Seeds);
    }
}