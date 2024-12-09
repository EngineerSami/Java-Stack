package com.mycompany.zookeeper;

class Bat extends Mammal {
    public Bat(int energy) {
        super(energy);
    }

    public void fly() {
        energy -= 50;
        System.out.println("The bat is now airborne.");
        displayEnergy();
    }

    public void eatHumans() {
        energy += 25;
        System.out.println("The bat is satisfied after eating a human.");
        displayEnergy();
    }

    public void attackTown() {
        energy -= 100;
        System.out.println("The bat has attacked a town.");
        displayEnergy();
    }
}
