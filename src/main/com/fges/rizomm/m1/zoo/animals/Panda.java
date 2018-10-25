package com.fges.rizomm.m1.zoo.animals;

public class Panda extends Vertebrates {

    @Override
    public String toString() {
        return "Panda : " + super.toString();
    }

    @Override
    public String scream() {
        return "ROAAAAAR";
    }

    public Panda(){
        super(Food.Bamboo);
    }
}
