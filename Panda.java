import java.util.Random;
/* 
 Title : CSE 11
 Main Class File: Assignment8.java
 File: Panda.java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**
 * The  Panda class represents extends an 
 * abstract class and implements the iterface.
 * 
 * Bugs: none
 * @author Kavya shah
 */

public class Panda extends Animal implements Herbivore{
    private static final String NAME= "Panda";
    /**
     * Constructs a default Panda with age 0, 
     * health 0, and strength 0.
     */
    public Panda(){
        super();
    }
    /**
     * Constructs a Panda with specified age, health, and strength.
     * @param age The age of the panda.
     * @param health The health of the panda.
     * @param strength The strength of the panda.
     */
    public Panda(int age, double health, double strength){
        super(age, health, strength);
    }
    /**
     * Gets the name of the panda.
     * @return The name of the panda.
     */
    public String getName(){
        return NAME;
    }
    /**
     * Checks if the provided animal is of
     *  the same species as a panda.
     * @param animal The animal to compare.
     * @return true if the animal is a panda, false otherwise.
     */
    @Override
    public boolean sameSpecies(Animal animal){
        if(animal instanceof Panda&&((Panda) animal).getName().equals(NAME)){
            return true;
        }else return false;

    }
    /**
     * Increases the strength of the panda 
     * by 40% when it sleeps.
     */
    @Override
    public void sleep(){
        setStrength(getStrength()*1.4);
    }
    /**
     * Checks if the panda is poisonous.
     * @return false because pandas are herbivores
     *  and not poisonous.
     */
    @Override
    public boolean isPoisonous(){
        return false;
    }
    /**
     * Eats a plant and gains strength based on a
     *  random strength increase.
     */
    @Override
    public void eatPlant() {
        Random rand = new Random();
        int strengthIncrease = rand.nextInt(51); 
        double newStrength = getStrength() + strengthIncrease;
        setStrength(newStrength);
    }
    /**
     * Returns a string representation of the panda, 
     * including its species.
     * @return The string representation of the panda.
     */
    @Override
    public String toString() {
        return super.toString() + "; species: Panda";
    }   

}