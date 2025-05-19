package Program2;
import java.util.Scanner;

public class ReverseStringDemo {

    // User-defined function to reverse a string
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Call user-defined function
        String reversed = reverseString(input);

        // Output result
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
