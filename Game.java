import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int z = r.nextInt(1,4);
        System.out.println("Enter 1 For Rock. \n Enter 2 For Paper. \n Enter 3 For Scissors. : ");
        int A = sc.nextInt();
        int rock =1;
        int paper = 2;
        int scissors=3;      
            // enhanced switch case

            if(A>3 || A<0){
                    System.out.println("invalid");
            }else
            {
                switch (A){
                    case 1  -> System.out.println("You entered Rock");
                    case 2 -> System.out.println("You entered Papers");
                    case 3 -> System.out.println("You entered Scissors");
            
                }
        
                switch (z){
                    case 1  -> System.out.println("Opponent entered Rock");
                    case 2 -> System.out.println("Opponent entered Papers");
                    case 3 -> System.out.println("Opponent entered Scissors");
                }
                
                
                if ((A-z+3)%3==0){
                    System.out.println("the game is tie !");
                }
                if ((A-z+3)%3==1){
                    System.out.println("you win Opponent lose !");
                }
                if ((A-z+3)%3==2){
                    System.out.println("you lose And opponent wins !");
                }
            }
    }
}
