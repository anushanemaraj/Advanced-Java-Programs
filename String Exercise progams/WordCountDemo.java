package demo1;

import java.util.Scanner;

public class WordCountDemo {

    // User-defined function to count words in a string
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split the string by one or more whitespace characters
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Call user-defined function
        int wordCount = countWords(input);

        // Output result
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
