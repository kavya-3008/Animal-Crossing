import java.util.Random ;
/* 
 Title : CSE 11
 Main Class File: Assignment8.java
 File: Toad.java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**
 * The  Toad class represents extends an 
 * abstract class and implements the iterface.
 * 
 * Bugs: none
 * @author Kavya shah
 */

public class Toad extends Animal implements Carnivore{
    private static final String NAME= "Toad";
    /**
     * Constructs a default Toad with age 0, 
     * health 0, and strength 0.
     */
    public Toad(){
        super();
    } 
    /**
     * Constructs a Toad with specified age, 
     * health, and strength.
     * @param age The age of the toad.
     * @param health The health of the toad.
     * @param strength The strength of the toad.
     */
    public Toad(int age, double health, double strength){
        super(age,health, strength);

    }
    /**
     * Gets the name of the toad.
     * @return The name of the toad.
     */
    public String getName(){
        return NAME;
    }
    /**
     * Checks if the provided animal is of the same species as a toad.
     * @param animal The animal to compare.
     * @return true if the animal is a toad, false otherwise.
     */
    @Override
    public boolean sameSpecies(Animal animal){
        if(animal instanceof Toad&&((Toad) animal).getName().equals(NAME)){
            return true;
        }else return false;

    }
    /**
     * Increases the strength of the toad by 20% when it sleeps.
     */
    @Override
    public void sleep(){
        setStrength(getStrength()*1.2);
    }
    /**
     * Checks if the toad is poisonous.
     * @return true if the toad is poisonous, false otherwise.
     */
    @Override
    public boolean isPoisonous(){
        return true;
    }
    /**
     * Eats another animal and gains strength
     *  based on the number of bugs eaten.
     * @param animal The animal being eaten.
     */
    @Override
    public void eatAnimal(Animal animal){
        Random rand= new Random();
        int bugsEaten= rand.nextInt(11);
        double bugGainStrength= animal.getStrength()*0.3;
        double newStrength= getStrength()+ (bugsEaten*bugGainStrength);
        setStrength(newStrength);
    }
    /**
     * Attempts to poison another animal with a 30% chance of success.
     * @return true if the poisoning is successful, false otherwise.
     */
    @Override
    public boolean poisonAnimal(){
        Random rand= new Random();
        double chance= rand.nextDouble()*1.0;
        return chance<=0.3;
        
    }
    /**
     * Returns a string representation of the toad, including its species.
     * @return The string representation of the toad.
     */
    @Override
    public String toString() {
        return super.toString() + "; species: Toad";
    }


 

}