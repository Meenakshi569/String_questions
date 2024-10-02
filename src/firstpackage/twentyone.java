package firstpackage;
//	WAP to accept a sentence and extract the palindrome words.
import java.util.Scanner;

public class twentyone {

    // Function to check if a word is a palindrome
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Function to extract and print palindrome words from a sentence
    public static void extractPalindromeWords(String sentence) {
        // Split the sentence into words based on spaces
        String[] words = sentence.split("\\s+"); // "\\s+" handles multiple spaces

        System.out.println("Palindrome words:");

        for (String word : words) {
            // Check if the word is a palindrome and not empty
            if (word.length() > 0 && isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        extractPalindromeWords(inputSentence);

        scanner.close();
    }
}

