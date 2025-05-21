package Program2;

public class EmailValidator {
    public static void main(String[] args) {
        String email = "student@example.com";

        if (email.contains("@") && email.startsWith("student") && email.endsWith(".com")) {
            System.out.println("Valid email pattern.");
        } else {
            System.out.println("Invalid email pattern.");
        }
    }
}
