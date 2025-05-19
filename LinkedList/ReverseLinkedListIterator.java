//2. Write a Java program to iterate a linked list in reverse order (using 
//objlist.descendingIterator())
package javalab;
import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedListIterator {
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
        System.out.println("Original LinkedList: " + colors);

        // Use descendingIterator to iterate in reverse order
        System.out.println("Iterating in reverse order:");
        Iterator<String> reverseIterator = colors.descendingIterator();

        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
