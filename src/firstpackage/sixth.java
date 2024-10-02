package firstpackage;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        String secondString = scanner.nextLine();

        // Compare the two strings using equals() method
        boolean areEqual = firstString.equals(secondString);
        System.out.println("Using equals(): " + (areEqual ? "Strings are equal" : "Strings are not equal"));

        // Compare the two strings using equalsIgnoreCase() method
        boolean areEqualIgnoreCase = firstString.equalsIgnoreCase(secondString);
        System.out.println("Using equalsIgnoreCase(): " + (areEqualIgnoreCase ? "Strings are equal (case insensitive)" : "Strings are not equal (case insensitive)"));

        // Compare the two strings using compareTo() method
        int comparisonResult = firstString.compareTo(secondString);
        if (comparisonResult == 0) {
            System.out.println("Using compareTo(): Strings are equal");
        } else if (comparisonResult < 0) {
            System.out.println("Using compareTo(): The first string is less than the second string");
        } else {
            System.out.println("Using compareTo(): The first string is greater than the second string");
        }

        // Close the scanner
        scanner.close();
    }
}
