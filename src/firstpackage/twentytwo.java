package firstpackage;
//	WAP to accept a sentence and display the words having double sequences.(eq- I Like Rabbit---- rabbit)
import java.util.Scanner;

public class twentytwo {

    // Function to check if a word contains any repeated consecutive characters
    public static boolean hasRepeatedCharacters(String word) {
        // Iterate through the word to check for consecutive repeated characters
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                return true;
            }
        }
        return false;
    }

    // Function to extract and print words with repeated characters from a sentence
    public static void extractRepeatedCharacterWords(String sentence) {
        // Split the sentence into words based on spaces
        String[] words = sentence.split("\\s+"); // "\\s+" handles multiple spaces

        System.out.println("Words with repeated characters:");

        for (String word : words) {
            // Check if the word has repeated characters and not empty
            if (word.length() > 0 && hasRepeatedCharacters(word)) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        extractRepeatedCharacterWords(inputSentence);

        scanner.close();
    }
}

