package firstpackage;
// WAP to assign 7 country names and corresponding wonder names in two separate arrays
//and after that search a
//
import java.util.Scanner;

public class twentyfour {

    public static void main(String[] args) {
        // Define arrays for country names and their corresponding wonders
        String[] countries = {"USA", "India", "China", "Brazil", "Egypt", "France", "Italy"};
        String[] wonders = {"Statue of Liberty", "Taj Mahal", "Great Wall of China", "Christ the Redeemer", "Great Pyramid of Giza", "Eiffel Tower", "Colosseum"};

        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a country name
        System.out.print("Enter the country name to find its wonder: ");
        String inputCountry = scanner.nextLine();

        // Search for the country and display the corresponding wonder
        boolean found = false;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equalsIgnoreCase(inputCountry)) {
                System.out.println("The wonder of " + inputCountry + " is: " + wonders[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Country not found.");
        }

        // Close the scanner
        scanner.close();
    }
}


