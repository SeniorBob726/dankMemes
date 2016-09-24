import java.util.Random;
/**
 * Write a description of class RandomNumberGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomNumberGenerator
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class RandomNumberGenerator
     */
    public static void main(String[] args)
    {
        for( int i = 1; i<= 4; i++){
        Random gen = new Random();
        System.out.println(gen.nextInt(4) + 5);
    }
    }
}
