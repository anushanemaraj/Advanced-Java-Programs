package javalab;
import java.util.ArrayList;
import java.util.Collections;

public class ColorSorter {
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

        // Sort the colors alphabetically
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted colors: " + colors);
    }
}

