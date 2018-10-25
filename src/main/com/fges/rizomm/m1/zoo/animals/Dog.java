package com.fges.rizomm.m1.zoo.animals;

public class Dog extends Vertebrates {

    @Override
    public String toString() {
        return "Dog : " + super.toString();
    }

    @Override
    public String scream() {
        return "Woof";
    }

    public Dog(){
        super(Food.Meat);
    }
}
