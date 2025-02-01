import java.io.*;
import java.util.*;
public class Java_String_Reverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int n=A.length();
        boolean flag=true;
        for (int i=0;i<n;i++){
            if(A.charAt(i)!=A.charAt(n-i-1))
                flag=false;
        }
        if(flag==true)
            System.out.println("Yes");
        else
            System.out.println("No");
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
