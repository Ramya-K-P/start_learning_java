import java.util.Scanner;

public class error_handling_ex {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
