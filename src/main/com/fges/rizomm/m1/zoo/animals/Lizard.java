package com.fges.rizomm.m1.zoo.animals;

public class Lizard extends Vertebrates {

    @Override
    public String toString() {
        return "Lizard : " + super.toString();
    }

    @Override
    public String scream() {
        return "KAAAAAAAAAAA";
    }

    public Lizard(){
        super(Food.Insects);
    }
}
