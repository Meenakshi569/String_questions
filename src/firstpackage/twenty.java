package firstpackage;
import java.util.Scanner;
//	WAP to accept a sentence and display the words having length is greater than 5
public class twenty {
    public static void filterLongWords(String sentence) {
        // Split the sentence into words based on spaces
        String[] words = sentence.split("\\s+"); // "\\s+" handles multiple spaces

        System.out.println("Words with length greater than 5:");

        for (String word : words) {
            if (word.length() > 5) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        filterLongWords(inputSentence);

        scanner.close();


    }
}
