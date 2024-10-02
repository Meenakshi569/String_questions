package firstpackage;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowelCount = 0;

        String lowerCaseString = inputString.toLowerCase();

        String vowels = "aeiou";


        for (char c : lowerCaseString.toCharArray()) {

            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        scanner.close();
    }
}

