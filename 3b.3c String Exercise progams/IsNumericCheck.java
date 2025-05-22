//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
//function isNumeric()

package Program2;


import java.util.Scanner;

public class IsNumericCheck {

    // User-defined function to check if the string contains only numeric characters
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        return str.matches("\\d+"); // \\d means digit, + means one or more times
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string to check if it is numeric: ");
        String input = scanner.nextLine();

        // Call user-defined function
        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does NOT contain only numeric characters.");
        }

        scanner.close();
    }
}
