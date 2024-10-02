package firstpackage;
import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a day name
        System.out.print("Enter the day name (e.g., Monday): ");
        String dayName = scanner.nextLine().trim(); // Read and trim any extra spaces

        // Convert the day name to lowercase to handle case-insensitive input
        dayName = dayName.toLowerCase();

        // Determine the day number based on the input
        int dayNumber;
        switch (dayName) {
            case "monday":
                dayNumber = 1;
                break;
            case "tuesday":
                dayNumber = 2;
                break;
            case "wednesday":
                dayNumber = 3;
                break;
            case "thursday":
                dayNumber = 4;
                break;
            case "friday":
                dayNumber = 5;
                break;
            case "saturday":
                dayNumber = 6;
                break;
            case "sunday":
                dayNumber = 7;
                break;
            default:
                System.out.println("Invalid day name entered.");
                scanner.close();
                return;
        }

        // Output the day number
        System.out.println("The day number for " + dayName + " is: " + dayNumber);

        // Close the scanner
        scanner.close();
    }
}
