import java.math.BigInteger;
import java.util.Scanner;

public class Java_BigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input numbers as strings
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        
        // Convert strings to BigInteger
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        
        // Perform addition and multiplication
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);
        
        // Print results
        System.out.println(sum);
        System.out.println(product);
        
        scanner.close();
    }
}
