# Animal Kingdom Game
Here's a README file tailored for your GitHub repository, designed to present the assignment details for CSE 11 SP24 Assignment 8 clearly and effectively:


## Overview
This repository contains all the necessary files for completing Assignment 8 of the CSE 11 course at UCSD
The assignment involves applying concepts of Inheritance, Polymorphism, Abstract and Concrete Classes, and Interfaces to build a text-based animal fighting game.

## Learning Objectives
- Utilize inheritance and polymorphism through abstract and concrete classes.
- Implement interfaces to define behaviors across different classes.
- Apply UML diagrams to structure Java classes effectively.

## Assignment Details
The game simulates battles between different types of animals in a kingdom, where the user can interact and see the outcomes based on the animal's attributes and behaviors implemented via Java classes and interfaces.

### Key Components
- **Abstract Class Animal**: Serves as a base for all animal types.
- **Subclasses**: Specific animals like Wolf, Leopard, Panda, etc., each with unique behaviors.
- **Interfaces**: `Carnivore` and `Herbivore` dictate eating behaviors.
- **UML Diagrams**: Guide the creation of classes and their relationships.

## Repository Structure
- `Animal.java`: The abstract superclass for all animals.
- `Carnivore.java` and `Herbivore.java`: Interfaces that define specific behaviors.
- Animal subclasses (`Wolf.java`, `Leopard.java`, etc.): Implementations of specific animals.
- `AnimalActivities.java`: Contains logic for the interactions in the game, like fighting and reproducing.
- `Assignment8.java`: Main class for running tests and simulations.

## Setup and Execution
To run this project on your local machine:
1. Ensure your Java development environment is set up correctly.
2. Clone this repository:
   ```
   git clone https://github.com/your-username/cse11-sp24-assignment8.git
   ```
3. Compile the Java files:
   ```
   javac *.java
   ```
4. Run the main program:
   ```
   java Assignment8
   ```

## Contributing
This project is structured for academic purposes, and contributions are limited to educational enhancements and bug fixes.

## License
This project is provided for educational use and is not licensed for commercial use.


