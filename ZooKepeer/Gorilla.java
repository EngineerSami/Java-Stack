package com.mycompany.zookeeper;

class Gorilla extends Mammal {
    public Gorilla(int energy) {
        super(energy);
    }

    public void throwSomething() {
        energy -= 5;
        System.out.println("The gorilla has thrown an object.");
        displayEnergy();
    }

    public void eatBananas() {
        energy += 10;
        System.out.println("The gorilla is satisfied after eating bananas.");
        displayEnergy();
    }

    public void climb() {
        energy -= 10;
        System.out.println("The gorilla has climbed a tree.");
        displayEnergy();
    }
}
