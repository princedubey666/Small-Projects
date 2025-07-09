// Program to generate a random number in bounded range.

import java.util.Random;
public class Random{
    public static void Main(String[] args){
        Random r=new Random();
        int x=r.nextInt(6)+1;
        double y=r.nextDouble(10);
        boolean z=r.nextBoolean();
        System.out.println("The Random Integer value is : " + x);
        System.out.println("The Random Double value is : " + y );
        System.out.println("The Random Boolean value is : " + z);
    }
}
