package com.feat.exercise;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Define the Item class

class Item {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" + "name='" + name + '\'' + ", price=" + price + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Define the Order class
class Order {
    List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
}

// Define the Customer class
class Customer {
    String name;
    List<Order> orders;

    public Customer(String name, List<Order> orders) {
        this.name = name;
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }
}

public class ComplexFlatMapExample {
    public static void main(String[] args) {
        // Create some items
        Item item1 = new Item("Laptop", 1200.0);
        Item item2 = new Item("Mouse", 25.0);
        Item item3 = new Item("Keyboard", 75.0);
        Item item4 = new Item("Monitor", 300.0);
        Item item5 = new Item("Headphones", 150.0);

        // Create some orders
        Order order1 = new Order(Arrays.asList(item1, item2));
        Order order2 = new Order(Arrays.asList(item3, item1));
        Order order3 = new Order(Arrays.asList(item5));

        // Create some customers
        Customer customer1 = new Customer("Alice", Arrays.asList(order1, order2));
        Customer customer2 = new Customer("Bob", Arrays.asList(order3));

        List<Customer> customers = Arrays.asList(customer1, customer2);

        // Use flatMap to get a flattened list of all items
        List<Item> allItems = customers.stream()
                .flatMap(customer -> customer.getOrders().stream()) // Stream<Order> from each Customer
                .flatMap(order -> order.getItems().stream())      // Stream<Item> from each Order
                .collect(Collectors.toList());                     // Collect into a List<Item>

        Map<String,Double> map =allItems.stream().
                collect(Collectors.groupingBy(item->item.getName(), Collectors.summingDouble(item-> item.getPrice())));
        map.entrySet().stream().forEach(e-> System.out.println(e.getKey()+ " :" + e.getValue()));


        // Print all items
        allItems.forEach(System.out::println);
    }
}
