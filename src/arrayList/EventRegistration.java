package arrayList;
import java.util.Scanner;


class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class EventRegistration {

    static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {

            throw new InvalidAgeException(
                    "Age must be 18 or above to register."
            );
        }

        System.out.println("Age is valid.");
        System.out.println("Registration successful.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {

            validateAge(age);

        }
        catch (InvalidAgeException e) {

            System.out.println("Registration failed.");
            System.out.println("Reason: " + e.getMessage());
        }

        sc.close();
    }
}