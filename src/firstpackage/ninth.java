package firstpackage;
//WAP to accept  word and check if it is palindrome
import java.util.Scanner;

public class ninth {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String originalWord = scanner.nextLine().trim(); // Read and trim any extra spaces

        // Convert the word to lowercase for case-insensitive comparison
        String word = originalWord.toLowerCase();

        // Reverse the word
        String reversedWord = new StringBuilder(word).reverse().toString();

        // Check if the original word is equal to the reversed word
        if (word.equals(reversedWord)) {
            System.out.println(originalWord + " is a palindrome.");
        } else {
            System.out.println(originalWord + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}

