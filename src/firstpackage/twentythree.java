package firstpackage;
//WAP to accept roll no, name of 5 students and display them back on the screen in tabular form

import java.util.Scanner;

public class twentythree {

    public static void main(String[] args) {
        // Define arrays to hold roll numbers and names
        int[] rollNumbers = new int[5];
        String[] names = new String[5];

        Scanner scanner = new Scanner(System.in);

        // Input roll numbers and names for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rollNumbers[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Display the information in tabular form
        System.out.println("\nStudent Information:");
        System.out.println("---------------------------------");
        System.out.printf("%-15s %-20s\n", "Roll Number", "Name");
        System.out.println("---------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-15d %-20s\n", rollNumbers[i], names[i]);
        }

        scanner.close();
    }
}
