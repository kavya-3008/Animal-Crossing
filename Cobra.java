import java.util.Random ;
/* 
 Title : CSE 11
 Main Class File: Assignment8.java
 File: Cobra.java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**
 * The Cobra class represents extends an 
 * abstract class and implements the iterface.
 * 
 * Bugs: none
 * @author Kavya shah
 */

public class Cobra extends Animal implements Carnivore{
    private static final String NAME= "Cobra";
    /**
     * Constructs a default Cobra with age 0,
     *  health 0, and strength 0.
     */
    public Cobra(){
        super();
    } 
    /**
     * Constructs a Cobra with specified age, 
     * health, and strength.
     * @param age The age of the cobra.
     * @param health The health of the cobra.
     * @param strength The strength of the cobra.
     */
    public Cobra(int age, double health, double strength){
        super(age,health, strength);

    }
    /**
     * Gets the name of the cobra.
     * @return The name of the cobra.
     */
    public String getName(){
        return NAME;
    }
    /**
     * Checks if the provided animal is of the same species as a cobra.
     * @param animal The animal to compare.
     * @return true if the animal is a cobra, false otherwise.
     */
    @Override
    public boolean sameSpecies(Animal animal){
        if(animal instanceof Cobra&&((Cobra) animal).getName().equals(NAME)){
            return true;
        }else return false;

    }
    /**
     * Increases the strength of the cobra by 70% when it sleeps.
     */
    @Override
    public void sleep(){
        setStrength(getStrength()*1.7);
    }
    /**
     * Checks if the cobra is poisonous.
     * @return true if the cobra is poisonous, false otherwise.
     */
    @Override
    public boolean isPoisonous(){
        return true;
    }
    /**
     * Eats another animal and gains strength based on 90% of 
     * the eaten animal's strength.
     * @param animal The animal being eaten.
     */
    @Override
    public void eatAnimal(Animal animal){
        double eatenStrength= animal.getStrength()*0.9;
        double newStrength= getStrength()+eatenStrength;
        setStrength(newStrength);
    }
    /**
     * Attempts to poison another animal with an 80% 
     * chance of success.
     * @return true if the poisoning is successful,
     *  false otherwise.
     */
    @Override
    public boolean poisonAnimal(){
        Random rand= new Random();
        double chance= rand.nextDouble()*1.0;
        return chance<=0.8;
        
    }
    /**
     * Returns a string representation of the cobra,
     *  including its species.
     * @return The string representation of the cobra.
     */
    @Override
    public String toString() {
        return super.toString() + "; species: Cobra";
    }


 

}