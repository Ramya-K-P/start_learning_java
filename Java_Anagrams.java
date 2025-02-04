import java.util.Scanner;

public class Java_Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        // Convert strings to lowercase to make comparison case-insensitive
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If lengths are not equal, they can't be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Use an integer array to count character frequencies
        int[] charCount = new int[26]; // Since there are 26 letters in the alphabet

        // Count frequency of characters in 'a' and 'b'
        for (int i = 0; i < a.length(); i++) {
            charCount[a.charAt(i) - 'a']++; // Increase count for 'a'
            charCount[b.charAt(i) - 'a']--; // Decrease count for 'b'
        }

        // If all values in charCount are zero, then it is an anagram
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;

        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
