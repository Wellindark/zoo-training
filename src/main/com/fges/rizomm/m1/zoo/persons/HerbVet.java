package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Food;

public class HerbVet extends Vet {
    public HerbVet(){
        this.canGive = Food.Vegetables;
    }
}