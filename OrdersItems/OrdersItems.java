import java.util.ArrayList;

class Item {
    String name;
    double price;
    

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items;

    public Order(String name) {
        this.name = name;
        this.total = 0.0;
        this.ready = false;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
        this.total += item.price;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}

public class OrdersItems {
    public static void main(String[] args) {
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.0);
        Item item3 = new Item("drip coffee", 2.5);
        Item item4 = new Item("cappuccino", 4.5);

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %.2f\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        order2.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);
        order1.setReady(true);
        order4.addItem(item2);
        order4.addItem(item2);
        order2.setReady(true);

        System.out.printf("Name:, Total: , Ready: \n", order1.name, order1.total, order1.ready);
        System.out.printf("Name: , Total: , Ready: \n", order2.name, order2.total, order2.ready);
        System.out.printf("Name: , Total: , Ready: \n", order3.name, order3.total, order3.ready);
        System.out.printf("Name: , Total: , Ready: \n", order4.name, order4.total, order4.ready);
    }
}
