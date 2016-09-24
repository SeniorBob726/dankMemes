// Import statements go here.  For example,
// import java.awt.Color;
// import java.util.ArrayList;
// import java.util.Random;

/**
 *  Lab (or Programming Project) X: Name of Lab or PP<br>
 *
 *  One-sentence description of role or purpose of objects of this
 *  class goes here.
 *
 *  A more detailed description goes here, if necessary.
 *  <br> <br>
 *  Created: <br>
 *     [the date], [your name(s)]<br>
 *     With assistance from:  [people who helped (including instructor/TAs)]<br>
 *  Modifications: <br>
 *     [the date], [your name(s)], [the reason]<br>
 *
 *  @author [your name]   [with assistance from]
 *  @author [your partner's name]   [with assistance from]
 */
public class NormalClassTemplate
{
  // State: instance variables and shared class variables go here.
    private int x;                // example instance variable

  // Constructors

    /**
     * Constructs a new object of this class.
     *      @param   initialValue    initial value for the object's state
     */
    public NormalClassTemplate(int initialValue)
    {
        // initialise instance variables
        this.x = initialValue;
    }

  // Methods

    /**
     * Gets the value of one of this object's attributes (replace this
     * description with a one-sentence summary of your own).
     * You may provide more details in later sentences, but note that
     * they will only appear in the Method Details section of the class
     * documentation, not the Method Summary section.
     *      @return the attribute value
     */
    public int getAttribute()
    {
        return this.x;
    }

    /**
     * Sums x and y (replace this description with a one-sentence summary
     * of your own).  You may provide more details in later sentences, but
     * note that they will only appear in the Method Details section of the
     * class documentation, not the Method Summary section.
     * 
     *      @param  y   a sample parameter for a method
     *      @return     the sum of x and y 
     */
    public int invokeAMethod(int y)
    {
        // Internal comments describe the purpose of blocks of code, e.g.
        // Return the sum of the object's state and the input parameter.
        return this.x + y;
    }

}
