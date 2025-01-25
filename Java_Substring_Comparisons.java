import java.util.Scanner;
public class Java_Substring_Comparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
         smallest = s.substring(0, k); // Assign the first substring of length k to smallest
         largest = s.substring(0, k);  // Assign the first substring of length k to largest

         // Iterate through all substrings of length k
         for (int i = 1; i <= s.length() - k; i++) {
         String substring = s.substring(i, i + k); // Extract substring of length k

        if (substring.compareTo(smallest) < 0) {
            smallest = substring; // Update smallest if current substring is lexicographically smaller
        }
        if (substring.compareTo(largest) > 0) {
            largest = substring; // Update largest if current substring is lexicographically larger
        }
    }
        
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
