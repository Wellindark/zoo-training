package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Animal;
import com.fges.rizomm.m1.zoo.animals.Food;

public abstract class AnimalKeeper extends Employee {

    public Food canGive;

    public AnimalKeeper(Food canGive){
        this.canGive = canGive;
    }

    public void feed(Animal animal, Food food)throws Exception {

        if (food != null && food == canGive) {
            animal.eat(food);
        }

    }
}
