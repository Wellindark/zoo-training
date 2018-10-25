package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Food;

public class MeatVet extends Vet {
    public MeatVet(){
        this.canGive = Food.Meat;
    }
}