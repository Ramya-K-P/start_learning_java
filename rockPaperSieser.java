import java.util.Random;
import java.util.Scanner;

public class rockPaperSieser {
    public static void main(String[] args){
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int cn=r.nextInt(3);
        // System.out.println(cn);
        System.out.println("enter '0' for rock , '1' for paper ,'2' for seiser");
        int un=sc.nextInt();
        if(cn==un){
            System.out.println("draw");
        }
        else if ((un==0 && cn==2)||(un==1 && cn==0)||(un==2 && cn==1)) {
            System.out.println("you win");    
        }
        else{
            System.out.println("computer win");
        }
        if (cn==0) {
           System.out.println("com choose rock"); 
        }
        else if (cn==1) {
            System.out.println("com choose paper");
        }
        else if(cn==2){
            System.out.println("com choose sieser");
        }
    }
}
