package com.mycompany.coffeapp;

import java.util.ArrayList;


public class Order {
 private final String customerName;
 private final ArrayList<Item> items;

    // Constructor
    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    // Add item to the order
    public void addItem(Item item) {
        this.items.add(item);
    }

    // Display order details
   public void displayOrder() {
    System.out.println("Order for: " + customerName);
    System.out.println("Items:");
    double total = 0; // Initialize total cost

    for (Item item : items) {
        System.out.println(item.getName() + " -- $" + String.format("%.2f", item.getPrice()));
        total += item.getPrice(); // Add item price to total
    }

    System.out.println("Total: $" + String.format("%.2f", total)); // Print total cost
}
}
