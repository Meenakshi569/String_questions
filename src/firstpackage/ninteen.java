package firstpackage;
//WAP to accept a String and Display it in Title Case.(eq- My name is covid----- My Name Is Covid)
import java.util.Scanner;

public class ninteen
{

    public static String convertToTitleCase(String input) {
        // Split the string into words based on spaces
        String[] words = input.split(" ");
        StringBuilder titleCaseString = new StringBuilder();

        for (String word : words) {
            // Check if the word is not empty
            if (!word.isEmpty()) {
                // Convert the first letter to uppercase and the rest to lowercase
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1).toLowerCase();
                titleCaseString.append(firstLetter).append(restOfWord).append(" ");
            }
        }

        // Convert the StringBuilder to a String and trim any trailing spaces
        return titleCaseString.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String titleCaseString = convertToTitleCase(inputString);
        System.out.println("Title case string: " + titleCaseString);

        scanner.close();
    }
}

