package firstpackage;

import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Compare the strings lexicographically
        int comparisonResult = str1.compareTo(str2);

        if (comparisonResult < 0) {
            System.out.println("\"" + str2 + "\" comes later in lexicographic order than \"" + str1 + "\".");
        } else if (comparisonResult > 0) {
            System.out.println("\"" + str1 + "\" comes later in lexicographic order than \"" + str2 + "\".");
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}

