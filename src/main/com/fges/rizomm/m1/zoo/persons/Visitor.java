package com.fges.rizomm.m1.zoo.persons;

public abstract class Visitor{
    AgeEnum age;

    public Visitor(AgeEnum age){
        this.age = age;
    }
}