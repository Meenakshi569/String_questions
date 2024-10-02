package firstpackage;
//	WAP to accept  String and Convert its individual characters to capital and Small alternately.(Amar----- aMaR)
    import java.util.Scanner;

    public class seventeen {

        public static String convertAlternately(String input) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (i % 2 == 0) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }
            return result.toString();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            String convertedString = convertAlternately(inputString);
            System.out.println("Converted string: " + convertedString);

            scanner.close();
        }
    }

