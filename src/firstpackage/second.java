package firstpackage;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        // Construct the full name
        String fullName = firstName + " " + middleName + " " + lastName;

        // Construct the short name
        String shortName = (firstName.charAt(0) + "." + middleName.charAt(0) + "." + lastName.charAt(0) + ".").toUpperCase();


        System.out.println("Full Name: " + fullName);
        System.out.println("Short Name: " + shortName);


        scanner.close();
    }
}

