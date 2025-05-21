package Program2;
import java.util.Scanner;

public class CapitalizeWordsDemo {

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.trim().split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase())
                           .append(" ");
            }
        }

        return capitalized.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Call user-defined function
        String result = capitalizeWords(input);

        // Output result
        System.out.println("Capitalized sentence: " + result);

        scanner.close();
    }
}
