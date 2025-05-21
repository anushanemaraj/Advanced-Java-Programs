package Program2;
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    // Characters to be used in the random string
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    // User-defined function to generate a random string of specified length
    public static String generateRandomString(int length) {
        if (length <= 0) {
            return "";
        }

        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: desired length of random string
        System.out.print("Enter the desired length of the random string: ");
        int length = scanner.nextInt();

        // Call user-defined function
        String randomString = generateRandomString(length);

        // Output the result
        System.out.println("Generated random string: " + randomString);

        scanner.close();
    }
}
