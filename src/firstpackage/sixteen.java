package firstpackage;
//	WAP in java to accept 5 String/Name and Display the names that start with a Vowel
import java.util.Scanner;

public class sixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to hold 5 names
        String[] names = new String[5];

        // Prompt user to enter 5 names
        System.out.println("Enter 5 names:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Display names that start with a vowel
        System.out.println("\nNames that start with a vowel:");

        for (String name : names) {
            // Convert name to lowercase to simplify comparison
            char firstChar = Character.toLowerCase(name.charAt(0));

            // Check if the first character is a vowel
            if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                System.out.println(name);
            }
        }

        scanner.close();
    }
}
