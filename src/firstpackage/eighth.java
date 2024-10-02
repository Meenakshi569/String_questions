package firstpackage;
import java.util.Scanner;
//	WAP to accept a String and Convert the case of each alphabet present in it.(eq- JaVa---jAvA)
import java.util.Scanner;

public class eighth {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a StringBuilder to build the result string
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (char c : inputString.toCharArray()) {
            // Convert the case of the character and append to result
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c); // Append non-alphabet characters as is
            }
        }

        // Output the resulting string
        System.out.println("Converted string: " + result.toString());

        // Close the scanner
        scanner.close();
    }
}

