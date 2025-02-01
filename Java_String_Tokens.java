import java.util.Scanner;

public class Java_String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim(); // Trim leading and trailing spaces

        if (s.isEmpty()) {
            System.out.println(0); // If input is empty, print 0 tokens
        } else {
            // Splitting the string using non-alphabetic characters as delimiters
            String[] tokens = s.split("[^A-Za-z]+");

            System.out.println(tokens.length); // Print the number of tokens
            for (String token : tokens) {
                System.out.println(token); // Print each token on a new line
            }
        }

        scan.close();
    }
}
