package javalab;

import java.util.ArrayList;

public class ColorRemove {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original list
        System.out.println("Original colors: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            String removed = colors.remove(1);
            System.out.println("Removed 2nd element: " + removed);
        }

        // Remove the color "Blue" if it exists
        boolean blueRemoved = colors.remove("Blue");
        if (blueRemoved) {
            System.out.println("\"Blue\" was removed from the list.");
        } else {
            System.out.println("\"Blue\" was not found in the list.");
        }

        // Display the updated list
        System.out.println("Updated colors: " + colors);
    }
}

