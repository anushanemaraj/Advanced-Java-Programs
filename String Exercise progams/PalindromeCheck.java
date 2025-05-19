package Program2;
import java.util.Scanner;

public class PalindromeCheck {

    // User-defined function to check for palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Compare original cleaned string with reversed
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        // Call user-defined function
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome (ignoring case and punctuation).");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
