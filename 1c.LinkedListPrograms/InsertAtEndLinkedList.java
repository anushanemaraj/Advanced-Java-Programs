//3. Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast("Pink"))

package javalab;

import java.util.LinkedList;

public class InsertAtEndLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colorList = new LinkedList<>();

        // Add some initial colors
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");

        // Display the original list
        System.out.println("Original LinkedList: " + colorList);

        // Insert the specified element at the end using offerLast()
        colorList.offerLast("Pink");

        // Display the updated list
        System.out.println("Updated LinkedList after inserting 'Pink' at the end: " + colorList);
    }
}
