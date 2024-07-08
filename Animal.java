import java.util.Random;
/* 
 Title : CSE 11
 Main Class File: Assignment8.java
 File: Animal.java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**
 * The abstract Animal class represents an animal.
 * 
 * Bugs: none
 * @author Kavya shah
 */
public abstract class Animal {
    private int age;
    private double health; 
    private double strength;
    private static final String NAME= "Animal";
    /**
     * Constructs a default Animal with age 0,
     *  health 0, and strength 0.
     */
    protected Animal(){
        this.age= 0;
        this.health=0;
        this.strength=0;
    }
    /**
     * Constructs an Animal with specified age, health, 
     * and strength.
     * @param age The age of the animal.
     * @param health The health of the animal.
     * @param strength The strength of the animal.
     */
    protected Animal(int age, double health, double strength ){
        this.age= age;
        this.health= health;
        this.strength= strength;
    }
    /**
     * Gets the age of the animal.
     * @return The age of the animal.
     */
    public int getAge(){
        return this.age= age;
    }


    /**
     * Gets the health of the animal.
     * @return The health of the animal.
     */
    public double getHealth(){
        return this.health= health;
    }
    /**
     * Gets the strength of the animal.
     * @return The strength of the animal.
     */
    public double getStrength(){
        return this.strength= strength;
    }

    /**
     * Sets the health of the animal.
     * @return The health of the animal.
     */
    public void setHealth(double health){
        this.health= health;
    }

    /**
     * sets the strength of the animal.
     * @return The strength of the animal.
     */
    public void setStrength(double strength){
        this.strength= strength;
    }
    /**
     * Gets the name of the animal.
     * @return The name of the animal.
     */
    public String getName(){
        return NAME;
    }
    /**
     * Attacks another animal and reduces its health.
     * @param animal The animal being attacked.
     * @return The damage dealt in the attack.
     */
    public double attack(Animal animal){
        Random rand= new Random();
        double ranNUm= rand.nextDouble()*(this.strength)+1;
        animal.setHealth(animal.getHealth()-ranNUm);
        return ranNUm;

    }

    /**
     * Checks if this animal is of the same 
     * species as another animal.
     * @param animal The animal to compare.
     * @return true if they are of the same species, 
     * false otherwise.
     */
    public abstract boolean sameSpecies(Animal animal);
    /**
     * Makes the animal sleep.
     */
    public abstract void sleep();
   /**
     * Checks if the animal is poisonous.
     * @return true if the animal is poisonous, false otherwise.
     */
    public abstract boolean isPoisonous();

    /**
     * Attempts to poison another animal.
     * @return true if the poisoning is successful, false otherwise.
     */
    public boolean poisonAnimal(){
        return false;
    }
    //converts an animal object to string
    @Override
    public String toString() {
    return "(Animal)" + " age: " + getAge() +
    "; health: " + getHealth() + "; strength: " + getStrength();
    }
        

}