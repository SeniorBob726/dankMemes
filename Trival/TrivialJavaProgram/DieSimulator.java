import java.util.Random;
/**
 * Write a description of class DieSimulator here.
 * 
 * @author (Adrian Heldt) 
 * @version (24 September 2016)
 */
public class DieSimulator
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class DieSimulator
     */
    public static void main(String[] args)
    {
        Random generator = new Random();
       /*The following line prints out a line so that in the case that someone forgot to clear the
        *terminal and everything is unorganized. The line organizes it somewhat so that everything is
        *separated by ---------------.  It's purpose is just mainly to look nice
        */
        System.out.println("--------------------");
        //The following statement changes the random generator into a variable
       int dave = (generator.nextInt(6) + 1);
       //The next line prints out the random number
       System.out.println(dave);
       //The following if's statements print out what color the die is based on the colors of the rainbow
  
       if (dave == 1) {
            System.out.println("The color is red");
        }
        else if (dave == 2) {
            System.out.println("The color is orange");
        }
        else if (dave == 3) {
            System.out.println("The color is yellow");
        }
        else if (dave == 4) {
            System.out.println("The color is green");
        }
        else if (dave == 5) {
            System.out.println("The color is blue");
        }
        else if (dave == 6) {
            System.out.println("The color is purple");
        }
        else {
        }
       System.out.println("--------------------");

        // initialise instance variables
    }
}
