package com.mycompany.coffeapp;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // Constructor
    public CoffeeKiosk() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    // Add menu item
    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        newItem.setIndex(menu.size()); // Set index to the size of the menu
        menu.add(newItem);
    }

    // Display menu
    public void displayMenu() {
        for (Item item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + String.format("%.2f", item.getPrice()));
        }
    }

    // Create a new order
    public void newOrder() {
        Scanner scanner = new Scanner(System.in);

        // Get customer name
        System.out.println("Please enter customer name for new order:");
        String name = scanner.nextLine();
        Order newOrder = new Order(name);

        // Show the menu
        displayMenu();

        // Get menu item index
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = scanner.nextLine();

        while (!itemNumber.equals("q")) {
            try {
                int index = Integer.parseInt(itemNumber);
                if (index >= 0 && index < menu.size()) {
                    Item item = menu.get(index);
                    newOrder.addItem(item);
                    System.out.println(item.getName() + " added to order.");
                } else {
                    System.out.println("Invalid item index. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'q' to quit.");
            }

            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = scanner.nextLine();
        }

        // Add order to orders and display order details
        orders.add(newOrder);
        newOrder.displayOrder();
    }

    // Ninja Bonus: Add menu item by input
    public void addMenuItemByInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the new menu item:");
        String name = scanner.nextLine();
        System.out.println("Enter the price of the new menu item:");
        try {
            double price = Double.parseDouble(scanner.nextLine());
            addMenuItem(name, price);
            System.out.println(name + " added to the menu at $" + String.format("%.2f", price));
        } catch (NumberFormatException e) {
            System.out.println("Invalid price. Menu item not added.");
        }
    }
}