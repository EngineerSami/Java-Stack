/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cafejava;

/**
 *
 * @author Asus
 */
public class CafeJava {


    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.0;
        double lattePrice = 4.0;
        double cappuccinoPrice = 4.5;

        // Customer name variables
        String customer1 = "Shatha";
        String customer2 = "Ahmad";
        String customer3 = "Sali";
        String customer4 = "Adam";

        // Order completions
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION

        // Example: Greeting message for a customer
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Shatha"

        // Sali ordered a coffee
        System.out.println(generalGreeting + customer3);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage);
        }

        // Ahmad ordered a cappuccino
        System.out.println(generalGreeting + customer2);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // Sali just ordered 2 lattes
        double saliLatteTotal = lattePrice * 2;
        System.out.println(displayTotalMessage + saliLatteTotal);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage);
        }

        // Update the status flag for testing
        isReadyOrder3 = true;
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage);
        }

        // Adam was charged for a coffee but ordered a latte
        double correctedTotal = lattePrice - dripCoffeePrice;
        System.out.println("Apologies, " + customer4 + ". " + displayTotalMessage + correctedTotal);

        // Testing logic with updated prices and statuses
        mochaPrice = 4.0; // Change price for testing
        isReadyOrder4 = false; // Change status for testing
        System.out.println(displayTotalMessage + mochaPrice);
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
    }
}


