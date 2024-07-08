/* 
 Title : CSE 11
 Main Class File: Assignment8.java
 File: Leopard.java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/* Leopard class extending animal and implementing carnivore
 * Bugs: none
 * @author Kavya shah
 */
public class Leopard extends Animal implements Carnivore{
    private static final String NAME= "Leopard";
    /**
     * Constructs a default Leopard with age 0,
     *  health 0, and strength 0.
     */
    public Leopard(){
        super();
    } 
     /**
     * Constructs a Leopard with specified age,
     *  health, and strength.
     * 
     * @param age The age of the leopard.
     * @param health The health of the leopard.
     * @param strength The strength of the leopard.
     */
    public Leopard(int age, double health, double strength){
        super(age,health, strength);

    }
    /**
     * Gets the name of the leopard.
     * 
     * @return The name of the leopard.
     */
    public String getName(){
        return NAME;
    }
    /**
     * Checks if the provided animal is of the same 
     * species as a leopard.
     * 
     * @param animal The animal to compare.
     * @return true if the animal is a leopard, false otherwise.
     */
    @Override
    public boolean sameSpecies(Animal animal){
        if(animal instanceof Leopard&&((Leopard) animal).getName().equals(NAME)){
            return true;
        }else return false;

    }
    /**
     * Increases the strength of the leopard by 
     * 50% when it sleeps.
     */
    @Override
    public void sleep(){
        setStrength(getStrength()*1.5);
    }
    /**
     * Checks if the leopard is poisonous.
     * 
     * @return false because leopards are not poisonous.
     */
    @Override
    public boolean isPoisonous(){
        return false;
    }
    /**
     * Eats another animal and gains strength
     *  based on a percentage of the eaten animal's strength.
     * 
     * @param animal The animal to be eaten.
     */
    @Override
    public void eatAnimal(Animal animal){
        double eatenStrength= animal.getStrength()*0.55;
        double newStrength= getStrength()+eatenStrength;
        setStrength(newStrength);


    }
    /**
     * Returns a string representation of the leopard,
     *  including its species.
     * 
     * @return The string representation of the leopard.
     */
    @Override
    public String toString() {
        return super.toString() + "; species: Leopard";
    }
    

}