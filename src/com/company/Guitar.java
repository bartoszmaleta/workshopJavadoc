package com.company;
import java.math.BigDecimal;

/**
 * Guitar Model Object.
 *
 * <P>Various attributes of guitars, and related behaviour.
 *
 * <P>Note that {@link BigDecimal} is used to model the price - not double or float.
 * See {@link #Guitar(String, BigDecimal, Integer)} for more information.
 *
 * @author Les Paul
 * @version 2.0
 */
public class Guitar {

    /**
     * Constructor.
     *
     * @param name (required) brand name of the guitar. Must have content. Length
     * must be in range <code>1..50</code>.
     * @param price (optional) purchase price of the guitar.
     * @param numStrings (required) number of strings on the guitar. Can take
     * values 6 or 12.
     */
    Guitar(String name, BigDecimal price, Integer numStrings){
        //...elided
    }

    //There is a one-line form of javadoc comment, useful for shorter text :

    /** Return name passed to the constructor.  */
    String getName(){
        return null;
    }

    /** Return price passed to the constructor.   */
    BigDecimal getPrice(){
        return null;
    }

    /** Value - {@value}, key for storing the current guitar of interest in the session.*/
    public static final String KEY = "guitar";

    /**
     * Play the guitar.
     *
     * This method makes no guarantees as to how <em>well</em> the song is played.
     * @param songTitle must have content, and must have trimmed length greater than 2.
     */
    void play(String songTitle){
        //..elided
    }

    /**
     * Apply standard tuning to the guitar.
     *
     * @return <code>true</code> only if the guitar has been properly tuned.
     */
    boolean tune(){
        return true;
    }

    /**
     * Destroy the guitar while on stage.
     *
     * Not good for the environment.
     */
    @Deprecated
    void lightOnFireAndSmashLikeAWildman(){
        //..elided
    }

    //...other methods elided
}