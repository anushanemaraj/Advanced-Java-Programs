package javalab;
import java.util.LinkedList;
import java.util.Collections;

public class SwapLinkedListElements {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colorList = new LinkedList<>();

        // Add some colors
        colorList.add("Red");     // Index 0
        colorList.add("Green");   // Index 1
        colorList.add("Blue");    // Index 2
        colorList.add("Yellow");  // Index 3

        // Display original list
        System.out.println("Original LinkedList: " + colorList);

        // Swap the first (index 0) and third (index 2) elements
        Collections.swap(colorList, 0, 2);

        // Display updated list
        System.out.println("LinkedList after swapping 1st and 3rd elements: " + colorList);
    }
}
