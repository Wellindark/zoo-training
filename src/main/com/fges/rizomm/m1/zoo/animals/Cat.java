package com.fges.rizomm.m1.zoo.animals;

public class Cat extends Vertebrates{

    @Override
    public String toString() {
        return "Cat : " + super.getName();
    }

    @Override
    public String scream() {
        return "Miaou";
    }

    public Cat(){
        super(Food.Meat);
    }

}
