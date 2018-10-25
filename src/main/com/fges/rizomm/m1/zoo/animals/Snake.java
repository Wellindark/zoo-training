package com.fges.rizomm.m1.zoo.animals;

public class Snake extends Invertebrates {

    public Snake(Food food) {
        super(Food.Meat);
    }

    @Override
    public String toString() {
        return "Snake : " + super.toString();
    }

    @Override
    public String scream() {
        return "Hisssssssssssssss";
    }

    }
