package javalab;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorRemoverByIndex {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Display original list
        System.out.println("Original colors: " + colors);

        // Input the index (n-th element to remove)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index (starting from 0) of the color to remove: ");
        int index = scanner.nextInt();

        // Check if the index is valid
        if (index >= 0 && index < colors.size()) {
            String removedColor = colors.remove(index);
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid index. No color removed.");
        }

        // Display updated list
        System.out.println("Updated colors: " + colors);
        
        scanner.close();
    }
}
