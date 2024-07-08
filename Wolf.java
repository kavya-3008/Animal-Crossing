/* 
 Title : CSE 11
 Main Class File: Assignment8.java
 File: Wolf.java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**Wolf class extending animal and implementing carnivore
 * Bugs: none
 * @author Kavya shah
 */
public class Wolf extends Animal implements Carnivore{
    private static final String NAME= "Wolf";
    /**
     * Constructs a default Wolf with age 0, 
     * health 0, and strength 0.
     */
    public Wolf(){
        super();
    } 
    /**
     * Constructs a Wolf with specified age,
     *  health, and strength.
     * 
     * @param age The age of the wolf.
     * @param health The health of the wolf.
     * @param strength The strength of the wolf.
     */
    public Wolf(int age, double health, double strength){
        super(age,health, strength);

    }
    /**
     * Gets the name of the wolf.
     * 
     * @return The name of the wolf.
     */
    public String getName(){
        return NAME;
    }
    /**
     * Checks if the provided animal is of the same 
     * species as a wolf.
     * 
     * @param animal The animal to compare.
     * @return true if the animal is a wolf, false otherwise.
     */
    @Override
    public boolean sameSpecies(Animal animal){
        if(animal instanceof Wolf&&((Wolf) animal).getName().equals(NAME)){
            return true;
        }else return false;

    }
    /**
     * Increases the strength of the wolf by 60% when it sleeps.
     */
    @Override
    public void sleep(){
        setStrength(getStrength()*1.6);
    }
    /**
     * Checks if the wolf is poisonous.
     * 
     * @return false because wolves are not poisonous.
     */
    @Override
    public boolean isPoisonous(){
        return false;
    }
    /**
     * Eats another animal and gains strength based on
     *  a percentage of the eaten animal's strength.
     * 
     * @param animal The animal to be eaten.
     */
    @Override
    public void eatAnimal(Animal animal){
        double eatenStrength= animal.getStrength()*0.60;
        double newStrength= getStrength()+eatenStrength;
        setStrength(newStrength);


    }
    /**
     * Returns a string representation of the wolf,
     *  including its species.
     * 
     * @return The string representation of the wolf.
     */
    @Override
    public String toString() {
        return super.toString() + "; species: Wolf";
    }
    

}