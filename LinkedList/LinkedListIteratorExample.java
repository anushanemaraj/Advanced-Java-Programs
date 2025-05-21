package javalab;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorExample {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original list
        System.out.println("Full list: " + colors);

        // Create a ListIterator starting from index 1 (2nd position)
        ListIterator<String> iterator = colors.listIterator(1);

        // Iterate through the list from the 2nd position
        System.out.println("Iterating from 2nd element:");
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }
    }
}

