package firstpackage;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[] words = inputString.trim().split("\\s+");

        int wordCount = words.length;

        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}

