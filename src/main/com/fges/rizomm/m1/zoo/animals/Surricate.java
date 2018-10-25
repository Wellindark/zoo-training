package com.fges.rizomm.m1.zoo.animals;

public class Surricate extends Vertebrates {

    @Override
    public String toString() {
        return "Surricate : " + super.toString();
    }

    @Override
    public String scream() {
        return "Kikikiki";
    }

    public Surricate(){
        super(Food.Vegetables);
    }
}
