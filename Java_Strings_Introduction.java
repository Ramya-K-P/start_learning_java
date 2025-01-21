import java.io.*;
import java.util.*;

public class Java_Strings_Introduction {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println((A.length()+B.length()));
        int i=0,j=0;
          int flag = 0;
         while (i < A.length() && j < B.length()) {
            if (A.charAt(i) == B.charAt(j)) {
                i++;
                j++;
                continue;
            }
            if (A.charAt(i) > B.charAt(j)) {
                System.out.println("Yes");
                flag = 1; // A is lexicographically greater
                break;
            }
            if (A.charAt(i) < B.charAt(j)) {
                System.out.println("No");
                flag = 1; // A is lexicographically smaller
                break;
            }
        }
        
        // If no decision has been made yet, check the lengths
        if (flag == 0) {
            if (A.length() > B.length()) {
                System.out.println("Yes");  // A is greater because it's longer
            } else {
                System.out.println("No");  // A is smaller or equal
            }
        }
        String result1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String result2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.print(result1+" ");
        System.out.println(result2);
        
    }
}
