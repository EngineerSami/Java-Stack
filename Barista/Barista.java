package com.mycompany.barista;



public class Barista {
    public static void main(String[] args) {
        Item item1 = new Item("Drip Coffee", 1.50);
        Item item2 = new Item("Cappuccino", 3.50);
        Item item3 = new Item("Latte", 4.00);
        Item item4 = new Item("Mocha", 4.50);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Alex");
        Order order4 = new Order("Taylor");
        Order order5 = new Order("Jordan");

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item1);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item4);

        order5.addItem(item1);
        order5.addItem(item2);
        order5.addItem(item3);

        order1.setReady(true);
        System.out.println(order1.getStatusMessage()); 
        System.out.println(order2.getStatusMessage()); 

        System.out.println(order1.getOrderTotal()); 
        System.out.println(order5.getOrderTotal()); 

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}

