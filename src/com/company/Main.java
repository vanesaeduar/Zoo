package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();
    System.out.println("Zoo is open for business");
    for (int i=0; i<3; i++){
        animals.add(new Animal());
    }
    Keeper keeper = new Keeper(animals);
    Manager manager = new Manager(animals, keeper);
    manager.manage();
    }
}
