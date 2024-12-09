package com.mycompany.zookeeper;

public class Mammal {
int energy;

    public Mammal(int energy) {
        this.energy = energy;
    }

    public int displayEnergy() {
        System.out.println("The mammal's energy level is " + energy);
        return energy;
    }
}
