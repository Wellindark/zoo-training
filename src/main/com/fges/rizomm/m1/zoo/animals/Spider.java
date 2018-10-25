package com.fges.rizomm.m1.zoo.animals;

public class Spider extends Invertebrates {

    @Override
    public String toString() {
        return "Spider : " + super.toString();
    }

    @Override
    public String scream() {
        return "Ksss";
    }

    public Spider(){
        super(Food.Insects);
    }
}
