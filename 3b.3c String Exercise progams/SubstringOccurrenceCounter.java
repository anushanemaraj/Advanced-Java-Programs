//Q2. Write a Java Program for Counting how many times a substring appears in a main string
//using user defined function countOccurrences()

package Program2;
import java.util.Scanner;

public class SubstringOccurrenceCounter {

    // User-defined function to count occurrences of a substring
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move past the last found substring
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input main string and substring
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to search for: ");
        String substring = scanner.nextLine();

        // Call the user-defined function
        int occurrences = countOccurrences(mainString, substring);

        // Display result
        System.out.println("The substring \"" + substring + "\" appears " + occurrences + " time(s) in the main string.");

        scanner.close();
    }
}
