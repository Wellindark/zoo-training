package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Animal;
import com.fges.rizomm.m1.zoo.animals.Food;

abstract class Vet extends Employee {

    public Food canGive;

    private boolean isCurable(Animal animal){
        return canGive == animal.diet;
    }


    public boolean cure(Animal animal) {
        if (isCurable(animal)){
            animal.health = 100;
            return true;
        }else {
            return false;
        }
    }

    public void checkHealth(Animal animal) {
        animal.getHealth();
    }

}
