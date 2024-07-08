/* 
 Title : CSE 11
 Main Class File: Assignment8.java
 File: AnimalActivities.java
 Quarter: CSE 11 Spring 2024
 Author: Kavya Shah 
 Email: kashah@ucsd.edu
 Instructor's Name: Professor Ochoa
 */

/**The animal activities class contains methods for 
 * stimulating aninal activities such as fighting and 
 * reproducing
 * 
 * Bugs: none
 * @author Kavya shah
 */
public class AnimalActivities{
    private final static int NUM_ANIMALS = 6;
    private final static int SPACING = 17;
    private final static String LEFT = "Left";
    private final static String RIGHT = "Right";

    private AnimalActivities(){};

    // predefined helper methods

    /* Below are helper methods to make fight() work */
    /**
    * Use this method in fight() to display the stats of both animals together
    *
    * @param (animal1) Animal on the left side to display stats
    * @param (animal2) Animal on the right side to display stats
    */
    public static void printBothAnimals(Animal animal1, Animal animal2) {
    int ageSpacing = calcSpacing(Integer.toString(animal1.getAge()));
    int healthSpacing = calcSpacing(String.format("%.2f",animal1.getHealth()));
    int strSpacing = calcSpacing(String.format("%.2f",animal1.getStrength()));
    int animalSpacing = calcSpacing(animal1.getName());
    String str = String.format( "(%s) %s (%s)\n" +
    "----------" + " " + "----------\n" +
    "A: %d %s A: %d\n" +
    "H: %.2f %s H: %.2f\n" +
    "S: %.2f %s S: %.2f\n", animal1.getName(),
    " ".repeat(animalSpacing),animal2.getName(),
    animal1.getAge()," ".repeat(ageSpacing),animal2.getAge(),
    animal1.getHealth(), " ".repeat(healthSpacing), animal2.getHealth(),
    animal1.getStrength(), " ".repeat(strSpacing), animal2.getStrength()
    );
    System.out.println(str);
    }
    /**
    * Helper method for printBothAnimals()
    *
    * @param (str) String on the left - used to calculate spacing
    * @return An int describing how many spaces to put between strings
    */
    public static int calcSpacing(String str) {
    int totalWidth = SPACING;
    int str1Width = str.length();
    int spacing = (totalWidth - str1Width);
    if (spacing < 0) {
    return 0;
    }
    return spacing;
    }
    /**
    * Use this method in fight() to display the current round.
    * @param (round) An int of the round (should start at 0)
    */
    public static void printRound(int round) {
    System.out.println();
    System.out.println("Round " + round + ":");
    }

    /**
    * Use this method in fight() to display the damage each round.
    *
    * @param (side) The side of the Animal that invoked the attack().
    * @param (damage) The int (damage) returned from an attack() call
    */
    public static void printAttack(String side, double damage) {
    System.out.printf("%s does %.2f damage!\n",side, damage);
    }
    /**
    * Use this method in fight() to display final stats and poison status.
    *
    * @param (animal1) Left animal
    * @param (animal2) Right animal
    * @param (poisoned) If either animal was poisoned
    */
    public static void printFinalStats(Animal animal1, Animal animal2,
    boolean poisoned) {
    System.out.println();
    printBothAnimals(animal1, animal2);
    if (poisoned) {
    System.out.println("An animal was poisoned.");
    }
    }
    /**
    * Use this method in fight() to display a tie game.
    */
    public static void printTieGame() {
    System.out.println("-------GAME OVER-------");
    System.out.println("TIE: Both animals died!");
    }
    /**
    * Use this method in fight() to display the winner.
    * @param (side) The side of the Animal that won.
    */
    public static void printWinner(String side) {
    System.out.println("-------GAME OVER-------");
    System.out.println(side + " animal wins!");
    }
    /**
     * Simulates a fight between two animals.
     * 
     * @param animal1 The first animal.
     * @param animal2 The second animal.
     * @return 0 if it's a tie, 1 if animal1 wins,
     *  2 if animal2 wins.
     */
    public static int fight(Animal animal1, Animal animal2){
        boolean animal1Poisioned= false;
        boolean animal2Poisioned= false;

        if(animal1.isPoisonous()){
            animal2Poisioned=animal1.poisonAnimal();
            
        }

        if(animal2.isPoisonous()){
            animal1Poisioned=animal2.poisonAnimal();
            
        }

        int roundNumber= 0;

        while(animal1.getHealth()>0&&animal2.getHealth()>0){
            printRound(roundNumber);
            printBothAnimals(animal1, animal2);

            double animal1Damage= animal1.attack(animal2);
            printAttack(LEFT, animal1Damage);

            double animal2Damage= animal2.attack(animal1);
            printAttack(RIGHT, animal2Damage);

            roundNumber++;

        }      

        printFinalStats(animal1, animal2, animal1Poisioned||animal2Poisioned);

        if(animal1.getHealth()<=0&& animal2.getHealth()<=0){
            printTieGame();
            return 0;

        }

        else if (animal1.getHealth() > 0) {
            if (animal1Poisioned) {
                printTieGame();
                return 0;
            }
            if (animal1 instanceof Carnivore) {
                ((Carnivore) animal1).eatAnimal(animal2);
            } else if (animal1 instanceof Herbivore) {
                ((Herbivore) animal1).eatPlant();
            }
            printWinner(LEFT);
            return 1;
        } else {
            if (animal2Poisioned) {
                printTieGame();
                return 0;
            }
            if (animal2 instanceof Carnivore) {
                ((Carnivore) animal2).eatAnimal(animal1);
            } else if (animal2 instanceof Herbivore) {
                ((Herbivore) animal2).eatPlant();
            }
            printWinner(RIGHT);
            return 2;
        }
    }


    /**
     * Reproduces two animals to create a new offspring.
     * 
     * @param animal1 The first parent animal.
     * @param animal2 The second parent animal.
     * @return The offspring animal if conditions are met,
     *  otherwise null.
     */
  

    public static Animal reproduce(Animal animal1, Animal animal2) {
        // Check if both animals are older than 5 and are of the same species
        if (animal1.getAge() > 5 && animal2.getAge() > 5 
            && animal1.sameSpecies(animal2)) {
            int age = 0;
            double health = 100;
            double strength = (animal1.getStrength() + 
                animal2.getStrength()) / 4; // Half of the average strength

            // Return a new animal based on the species
            if (animal1 instanceof Wolf) {
                return new Wolf(age, health, strength);
            } else if (animal1 instanceof Toad) {
                return new Toad(age, health, strength);
            } else if (animal1 instanceof Panda) {
                return new Panda(age, health, strength);
            }
        }
        // If conditions are not met, return null
        return null;
    }

}


        

       
    

