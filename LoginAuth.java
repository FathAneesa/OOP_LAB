import java.util.Scanner;

// User-defined exception class
class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

public class LoginAuth {

    // Method to authenticate user
    public static void authenticate(String username, String password) throws AuthenticationException {
        // Hardcoded valid username and password
        String validUsername = "ksb";
        String validPassword = "ksb";

        if (!username.equals(validUsername) || !password.equals(validPassword)) {
            throw new AuthenticationException("Invalid username or password!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter username: ");
        String user = scanner.nextLine();

        System.out.print("Enter password: ");
        String pass = scanner.nextLine();

        try {
            authenticate(user, pass);
            System.out.println("Login successful!");
        } catch (AuthenticationException e) {
            System.out.println("Login failed: " + e.getMessage());
        }

        scanner.close();
    }
}

