/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Carson Foor ( with help from Laurie White )
 * @version October 17 2016
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        statement.trim();
        if(statement.length() == 0)
        {
            response = "Say something, please!";
        }
        else if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("dog") >=0
                || statement.indexOf("cat") >=0
                || statement.indexOf("fish") >=0)
        {
            response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("Mr.") >=0
                || statement.indexOf("Ms.") >=0
                || statement.indexOf("Mrs.") >=0)
        {
            response = "It sounds like he is a good person.";
        }
        else if (statement.indexOf("Trump") >=0
                || statement.indexOf("Hillary") >=0
                || statement.indexOf("Clinton") >=0)
        {
            response = "It sounds like you want to kill America";
        }
        
        else if (statement.indexOf("soccer") >=0
                || statement.indexOf("ball") >=0
                || statement.indexOf("golf") >=0)
        {
            response = "Tell me more about the sports you play.";
        }
        else if (statement.indexOf("games") >=0
                || statement.indexOf("video game") >=0
                || statement.indexOf("video games") >=0) 
        {
            response = "It sounds like you are a hardcore gamer";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf(" ") == 0)
        {
            response = "Please enter something!";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Really!";
        }
        else if (whichResponse == 5)
        {
            response = "OMG!";
        }
        else if (whichResponse == 6)
        {
            response = "Totes McGoats";
        }

        return response;
    }
}
