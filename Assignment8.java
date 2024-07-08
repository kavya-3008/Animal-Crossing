/* 
 Title : CSE 11
 Main Class File: Assignment8.java
 File: Anssignment8.java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**The Assignment8 class contains methods for 
 * testing previous code
 * Bugs: none
 * @author Kavya shah
 */
public  class Assignment8{
    /**
     * Tests the sleep() method of the Animal class.
     * 
     * @return true if the test passes, false otherwise.
     */
    private static boolean testOne(){
        Animal animal = new Wolf(3, 80, 50); 
        double initialStrength = animal.getStrength();
        System.out.println("Strength is"+ animal.getStrength());
        animal.sleep();
        System.out.println("new Strength is"+ animal.getStrength());
        double expectedStrength = initialStrength * 1.6; 
        if(animal.getStrength()==expectedStrength){
            System.out.println("Test 1- sleep passed");}


            return animal.getStrength()==expectedStrength;

    }
    /**
     * Tests the eatAnimal() method of the Carnivore interface.
     * 
     * @return true if the test passes, false otherwise.
     */
    private static boolean testTwo(){
        Animal prey = new Panda(5, 100, 40); 
        Leopard predator = new Leopard(4, 90, 60); 
        double initialStrength = predator.getStrength();
        predator.eatAnimal(prey);
        double expectedStrength = initialStrength + (prey.getStrength() * 0.55); 
        boolean result = predator.getStrength() == expectedStrength; 
        if(result){
        System.out.println("Test Two (eatAnimal): passed ");}
        return result;
        
    }
    /**
     * Tests the poisonAnimal() method of the Toad class.
     * 
     * @return true if the test passes, false otherwise.
     */
    private static boolean testThree() {
        Toad toad = new Toad(6, 40, 15);
        boolean poisoned = false;
        for (int i = 0; i < 100; i++) {
            poisoned = toad.poisonAnimal();
            if (poisoned) {
                break;
            }
        }
        if (!poisoned) {
            System.out.println("Test 3 failed: poisonAnimal()");
           
        };

        return poisoned;
    }
    /**
     * Tests the reproduce() method of the AnimalActivities class.
     * 
     * @return true if the test passes, false otherwise.
     */
    private static boolean testFour() {
        Animal parent1 = new Wolf(6, 90, 60); // Age: 6, Health: 90, Strength: 60
        Animal parent2 = new Wolf(7, 85, 70); // Age: 7, Health: 85, Strength: 70
        Animal baby = AnimalActivities.reproduce(parent1, parent2);
        boolean result = baby != null && parent1.sameSpecies(baby) && parent2.sameSpecies(baby);
        System.out.println("Test Four (reproduce): " + (result ? "Passed" : "Failed"));
        return result;
    }
    /**
     * Tests the fight() method of the AnimalActivities class.
     * 
     * @return true if the test passes, false otherwise.
     */
    private static boolean testFive() {
        Animal stronger = new Leopard(5, 100, 80); // Age: 5, Health: 100, Strength: 80
        Animal weaker = new Panda(6, 90, 40); // Age: 6, Health: 90, Strength: 40
        int result = AnimalActivities.fight(stronger, weaker);
        System.out.println("result is "+ result);
        boolean passed = result == 1; // Expecting stronger animal to win
        System.out.println("Test Five (fight): " + (passed ? "Passed" : "Failed"));
        return passed;
    }

    /**
     * Runs all the unit tests.
     * 
     * @return true if all tests pass, false otherwise.
     */
    public static boolean unitTests(){
        if(!testOne()){
            return false;
        }
        if(!testTwo()){
            return false;
        }
        if(!testThree()){
            return false;
        }
        if(!testFour()){
            return false;
        }
        if(!testFive()){
            return false;
        }

        return true;
    }
    /**
     * Main method to run the unit tests.
     * 
     * @param args Command line arguments (unused).
     */
     public static void main(String[] args) {
        if (unitTests()) {
            System.out.println("All unit tests passed.\n");
        } else {
            System.out.println("Failed test.\n");
        }

    }
}