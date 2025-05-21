package Program2;

import java.util.Scanner;

public class TruncateStringDemo {

    // User-defined function to truncate a string and add ellipsis if needed
    public static String truncate(String str, int maxLength) {
        if (str == null || maxLength < 0) {
            return "";
        }

        if (str.length() <= maxLength) {
            return str;
        }

        if (maxLength <= 3) {
            return "...".substring(0, maxLength); // Avoid errors with very short maxLength
        }

        return str.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string and maximum length
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the maximum length: ");
        int maxLength = scanner.nextInt();

        // Call user-defined function
        String result = truncate(input, maxLength);

        // Output result
        System.out.println("Truncated string: " + result);

        scanner.close();
    }
}
