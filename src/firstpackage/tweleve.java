package firstpackage;

//WAP to accept the name of a person and guess the gender based on following Table.
import java.util.Scanner;

public class tweleve {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a name
        System.out.print("Enter the name of the person: ");
        String name = scanner.nextLine().trim();

        // Guess the gender based on the name
        String gender = guessGender(name);

        // Output the guessed gender
        System.out.println("Gender: " + gender);

        // Close the scanner
        scanner.close();
    }

    // Method to guess the gender based on the given name
    public static String guessGender(String name) {
        // Convert name to lower case for case-insensitive comparison
        String lowerCaseName = name.toLowerCase();

        // Check conditions to determine gender
        if (lowerCaseName.startsWith("mr.")) {
            return "Male";
        } else if (lowerCaseName.startsWith("miss")) {
            return "Female";
        } else if (lowerCaseName.startsWith("mrs")) {
            return "Married Female";
        } else if (lowerCaseName.endsWith("kumari")) {
            return "Female";
        } else {
            return "Cannot Determine";
        }
    }
}
