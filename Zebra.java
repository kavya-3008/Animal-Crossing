import java.util.Random;
/* 
 Title : CSE 11
 Main Class File: Assignment8.java
 File: Zebra.java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**
 * The  Zebra class represents extends an 
 * abstract class and implements the iterface.
 * 
 * Bugs: none
 * @author Kavya shah
 */

public class Zebra extends Animal implements Herbivore{
    private static final String NAME= "Zebra";
    /**
     * Constructs a default Zebra with age 0,
     *  health 0, and strength 0.
     */
    public Zebra(){
        super();
    }
    /**
     * Constructs a Zebra with specified age, 
     * health, and strength.
     * @param age The age of the zebra.
     * @param health The health of the zebra.
     * @param strength The strength of the zebra.
     */
    public Zebra(int age, double health, double strength){
        super(age, health, strength);
    }
    /**
     * Gets the name of the zebra.
     * @return The name of the zebra.
     */
    public String getName(){
        return NAME;
    }
    /**
     * Checks if the provided animal is of the 
     * same species as a zebra.
     * @param animal The animal to compare.
     * @return true if the animal is a zebra, false otherwise.
     */
    @Override
    public boolean sameSpecies(Animal animal){
        if(animal instanceof Zebra&&((Zebra) animal).getName().equals(NAME)){
            return true;
        }else return false;

    }
    /**
     * Increases the strength of the zebra by 30% when it sleeps.
     */
    @Override
    public void sleep(){
        setStrength(getStrength()*1.3);
    }
    /**
     * Checks if the zebra is poisonous.
     * @return false because zebras are herbivores 
     * and not poisonous.
     */
    @Override
    public boolean isPoisonous(){
        return false;
    }
    /**
     * Eats a plant and gains strength based
     *  on a random strength increase.
     */
    @Override
    public void eatPlant() {
        Random rand = new Random();
        int strengthIncrease = rand.nextInt(41); 
        double newStrength = getStrength() + strengthIncrease;
        setStrength(newStrength);
    }
    /**
     * Returns a string representation of the zebra,
     *  including its species.
     * @return The string representation of the zebra.
     */
    @Override
    public String toString() {
        return super.toString() + "; species: Zebra";
    }   

}