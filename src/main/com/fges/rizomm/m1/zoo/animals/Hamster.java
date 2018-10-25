package com.fges.rizomm.m1.zoo.animals;

public class Hamster extends Vertebrates {

    @Override
    public String toString() {
        return "Hamster : " + super.toString();
    }

    @Override
    public String scream() {
        return "Krikrikrik";
    }

    public Hamster(){
        super(Food.Seeds);
    }
}
