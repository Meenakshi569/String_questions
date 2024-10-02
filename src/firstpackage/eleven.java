package firstpackage;
//	WAP to accept a word and convert it to piglatin form(trouble --- oubletray)
import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().trim(); // Read and trim any extra spaces

        // Convert the word to Pig Latin
        String pigLatinWord = convertToPigLatin(word);

        // Output the Pig Latin word
        System.out.println("Pig Latin form: " + pigLatinWord);

        // Close the scanner
        scanner.close();
    }

    // Method to convert a word to Pig Latin
    private static String convertToPigLatin(String word) {
        // Convert the word to lowercase for consistency
        String lowerCaseWord = word.toLowerCase();

        // Check if the word starts with a vowel
        if (isVowel(lowerCaseWord.charAt(0))) {
            // If it starts with a vowel, add "way" or "yay" to the end
            return lowerCaseWord + "way";
        } else {
            // If it starts with a consonant, move the consonant cluster to the end and add "ay"
            int firstVowelIndex = findFirstVowelIndex(lowerCaseWord);
            if (firstVowelIndex == -1) {
                // No vowel found, just return the word itself
                return lowerCaseWord;
            }
            String consonantCluster = lowerCaseWord.substring(0, firstVowelIndex);
            String restOfWord = lowerCaseWord.substring(firstVowelIndex);
            return restOfWord + consonantCluster + "ay";
        }
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    // Method to find the index of the first vowel in a word
    private static int findFirstVowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                return i;
            }
        }
        return -1; // No vowel found
    }
}
