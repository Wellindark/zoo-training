package com.fges.rizomm.m1.zoo.animals;

public abstract class Animal {

    private String name;

    private int eatCount = 100;

    public String getName() {
        return name;
    }


    public int health = 100;

    public Food diet;

    public boolean inside = true;

    public boolean skeleton;

    public Animal(Food food){
        this.diet = food;
    }


    abstract String scream();

    public void eat(Food food) throws Exception {
        if(food != diet){
            throw new Exception("This is not in my diet!");
        } else if (eatCount >= 100){
            throw new Exception("I can't eat anything anymore");
        }else{
            eatCount++;
        }
    }

    public int getEatCount() {
        return eatCount;
    }

    public void setEatCount(int eatCount) {
        this.eatCount = eatCount;
    }
    @Override
    public String toString(){
        return getName();
    }
    public void setName(String name){
        this.name=name;
    }

    public void setHealth(int health) { this.health = health; }

    public int getHealth() {return health; }
}
