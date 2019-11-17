package io.zipcoder.polymorphism;

import java.security.PublicKey;

public class Dog extends Pet{

    public Dog(){
        super("Rex");
    }

    public Dog(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "Bark!";
    }
}
