package com.mycompany.zookeeper;

public class ZooKeeper {

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(100);
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.climb();
        gorilla.displayEnergy();


        Bat bat = new Bat(300);
        bat.fly();
        bat.fly();
        bat.fly();
        bat.eatHumans();
        bat.eatHumans();
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
    }
}