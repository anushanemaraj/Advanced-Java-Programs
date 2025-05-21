package Program2;
import java.util.Scanner;

public class RemoveWhitespaceDemo {

    // User-defined function to remove all whitespace characters from a string
    public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string with whitespace: ");
        String input = scanner.nextLine();

        // Call user-defined function
        String result = removeWhitespace(input);

        // Output result
        System.out.println("String after removing whitespace: " + result);

        scanner.close();
    }
}
