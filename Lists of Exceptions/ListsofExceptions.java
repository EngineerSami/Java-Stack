package com.mycompany.listsofexceptions;

import java.util.ArrayList;



public class ListsofExceptions {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {

                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Successfully casted value: " + castedValue);
            } catch (ClassCastException e) {
                System.out.println("An error occurred!");
                System.out.println("Error: Cannot cast value to Integer.");
                System.out.println("Index: " + i);
                System.out.println("Value: " + myList.get(i));
            }
        }
    }
}