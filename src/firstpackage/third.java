package firstpackage;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Initialize the count of capital letters
        int capitalCount = 0;

        // Iterate over each character in the string
        for (char c : inputString.toCharArray()) {
            // Check if the character is a capital letter
            if (Character.isUpperCase(c)) {
                capitalCount++;
            }
        }

        // Display the count of capital letters
        System.out.println("Number of capital letters: " + capitalCount);

        // Close the scanner
        scanner.close();
    }
}

