package com.mycompany.devices;

import java.util.Scanner;

public class Devices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone phone = new Phone();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1: Make a call");
            System.out.println("2: Play a game");
            System.out.println("3: Charge");
            System.out.println("q: Quit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> phone.makeCall();
                case "2" -> phone.playGame();
                case "3" -> phone.charge();
                case "q" -> {
                    System.out.println("Bye Bye!!.");
                    scanner.close();
                    return; // Exit the program
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
