package src;
import java.util.Random;

public class suma {
    public static void main (String [] args){
    Random rand = new Random();
       int x= rand.nextInt (10);
       int y= rand.nextInt (10);
       int z= x+y;
        System.out.println(z);
    }
}
