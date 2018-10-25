package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Cat;
import com.fges.rizomm.m1.zoo.animals.Food;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VetTest {

    @Test
    void test_vet_meat(){
        MeatVet meatVet = new MeatVet();
        assertSame(meatVet.canGive, Food.Meat);
    }
    @Test
    void test_vet_insects(){
        InsectVet insectVet = new InsectVet();
        assertSame(insectVet.canGive, Food.Insects);
    }
    @Test
    void test_vet_herbs(){
        HerbVet herbVet = new HerbVet();
        assertSame(herbVet.canGive, Food.Vegetables);
    }
    @Test
    void test_vet_bamboo(){
        BambooVet bambooVet= new BambooVet();
        assertSame(bambooVet.canGive, Food.Bamboo);
    }
    @Test
    void test_vet_seeds(){
        SeedsVet seedsVet=new SeedsVet();
        assertSame(seedsVet.canGive, Food.Seeds);
    }

    @Test
    void cure() {
        MeatVet meatVet = new MeatVet();
        Cat cat = new Cat();
        meatVet.cure(cat);
    }

    @Test
    void test_checkHealth() {
        MeatVet meatVet = new MeatVet();
        Cat cat = new Cat();
        meatVet.checkHealth(cat);

    }

}
