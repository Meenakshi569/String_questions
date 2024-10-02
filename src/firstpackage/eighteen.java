package firstpackage;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class eighteen {

    public static void countCharacterFrequency(String input) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Convert the string to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Iterate over each character in the string
        for (char c : input.toCharArray()) {
            // Skip non-alphabet characters
            if (Character.isLetter(c)) {
                // Update the frequency map
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        countCharacterFrequency(inputString);

        scanner.close();
    }
}
