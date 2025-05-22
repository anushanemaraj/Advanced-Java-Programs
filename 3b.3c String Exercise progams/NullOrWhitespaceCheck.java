//Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
//defined function isNullOrEmpty().

package Program2;
import java.util.Scanner;

public class NullOrWhitespaceCheck {

    // User-defined function to check if a string is null or only whitespace
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check the string using the user-defined method
        if (isNullOrEmpty(input)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string is valid: \"" + input + "\"");
        }

        scanner.close();
    }
}
