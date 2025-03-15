import java.util.*;


public class Java_Exception_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();  // Throws InputMismatchException if input is invalid
            int b = sc.nextInt();  // Throws InputMismatchException if input is invalid
            System.out.println(a / b);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }

        sc.close();
    }
}
