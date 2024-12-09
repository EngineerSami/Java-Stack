package com.mycompany.devices;



class Device {
    private int battery;

    public Device() {
        this.battery = 40;
    }

    public int getBattery() {
        return battery;
    }

    public void displayBattery() {
        System.out.println("Battery remaining: " + battery + "%");
    }

    public void makeCall() {
        if (battery <= 0) {
            System.out.println("Your Phone is dead");
        } else if (battery < 5 && battery > 0) {
            System.out.println("Your Phone will die");
        } else {
            battery -= 5;
            System.out.println("Making a call.");
            displayBattery();
        }
    }

    public void playGame() {
        if (battery <= 0) {
            System.out.println("Your Phone is dead");
        } else if (battery < 20 && battery > 0) {
            System.out.println("Your Phone will die");
        } else {
            battery -= 20;
            System.out.println("Playing a game.");
            displayBattery();
        }
    }

    public void charge() {
        battery += 50;
        if (battery > 100) {
            battery = 100; 
        }
        System.out.println("Charging phone.");
        displayBattery();
    }
}

class Phone extends Device {
    public void testMethods() {
       
    }
}

