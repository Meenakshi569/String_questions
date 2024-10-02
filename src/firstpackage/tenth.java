package firstpackage;
//WAP of SubString (AMAR SINGH--- R SINGH)
public class tenth {
    public static void main(String[] args) {
        // Define the original string
        String originalString = "AMAR SINGH";

        // Define the starting index for the substring
        int startIndex = originalString.indexOf("R"); // Find the index of the character 'R'

        // Extract the substring from the starting index to the end of the string
        String substring = originalString.substring(startIndex);

        // Output the original string and the extracted substring
        System.out.println("Original String: " + originalString);
        System.out.println("Extracted Substring: " + substring);
    }
}
