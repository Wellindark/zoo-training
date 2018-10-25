package com.fges.rizomm.m1.zoo.persons;

import com.fges.rizomm.m1.zoo.animals.Animal;

public class Cleaner extends Employee {

    private boolean isCleanable(Animal animal){
        if(animal.inside == true){
            return false;
        }else {
            return true;
        }
    }
    public void clean(Animal animal) {
        if(isCleanable(animal)){
            System.out.println(Animal.class + "cage has been cleaned");
        }
    }
}
