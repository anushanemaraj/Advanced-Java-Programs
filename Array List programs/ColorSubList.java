package javalab;
import java.util.ArrayList;
import java.util.List;

public class ColorSubList {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the full list
        System.out.println("Original colors: " + colors);

        // Extract the 1st and 2nd elements using subList (index 0 and 1)
        if (colors.size() >= 2) {
            List<String> subColors = colors.subList(0, 2); // from index 0 (inclusive) to 2 (exclusive)
            System.out.println("Extracted colors (1st and 2nd): " + subColors);
        } else {
            System.out.println("Not enough elements to extract.");
        }
    }
}
