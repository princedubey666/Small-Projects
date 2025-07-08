// Program to generate a random number in bounded range.

import java.util.Random;
public class Random{
    public static void Main(String[] args){
        Random r=new Random();
        int x=r.nextInt(6)+1;
        double y=r.nextDouble(10);
        boolean z=r.nextBoolean();
        System.out.println(x);
        System.out.println(y);
        System.out.println("it is : "+z);
    }
}
