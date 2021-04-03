package com.company;

import exceptions.NotHungry;

public class Animal {
    private int eaten=0;
    private boolean isHungry=false;
    private boolean hungry;


    public int eat() throws NotHungry {
        if (!isHungry){
            throw new NotHungry();
        }
        System.out.println("Animal is eating!");
        isHungry = false;
        eaten++;
        return eaten;
    }
    
    public boolean isHungry(){return hungry;}
    
}
