import java.util.Random;
/**
 * This program prints out 6 random number between 1 and 49 in a row
 * 
 * @author (Adrian Heldt) 
 * @version (9-24-16)
 */
public class LotteryPrinter
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class LotteryPrinter
     */
    public static void main(String[] args)
    {
       System.out.println("I hear you are play'n the lottery.  Here, play this combination.");
       System.out.println("It will make you richer than Donald Trump!");
       Random lottoOne = new Random();
       Random lottoTwo = new Random();
       Random lottoThree = new Random();
       Random lottoFour = new Random();
       Random lottoFive = new Random();
       Random lottoSix = new Random();
       int lotteryOne = (lottoOne.nextInt(49) + 1);
       int lotteryTwo = (lottoTwo.nextInt(49) + 1);
       int lotteryThree = (lottoThree.nextInt(49) + 1);
       int lotteryFour = (lottoFour.nextInt(49) + 1);
       int lotteryFive = (lottoFive.nextInt(49) + 1);
       int lotterySix = (lottoSix.nextInt(49) + 1);
       System.out.println(lotteryOne + " , " + lotteryTwo + " , "  + lotteryThree + " , " +  lotteryFour + " , " +  lotteryFive + " , " + lotterySix);
       
    }


}
