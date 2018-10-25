package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Food;

public class InsectVet extends Vet{
    public InsectVet(){
        this.canGive = Food.Insects;
    }
}