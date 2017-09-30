/**
 * 
 */
package Assignment_4;																							// Package Declared
public class MercedesBenz extends Car{																			// class MercedesBenz declared which extends car class 
    private int maxSpeed;																						// private integer variable declared
    private int doors;																							// private integer variable declared
    private int airbags;																						// private integer variable declared
    public MercedesBenz(String Name, String Engine, int minSpeed, int maxSpeed, int doors, int airbags) {		// constructor created with 6 parameters 
        super(Name, Engine, minSpeed);																			// Super keyword help MercedesBenz class to inherit the variables of car class 
        this.maxSpeed = maxSpeed;																				// This keyword is used to distinguish between class variables and instance variables
        this.doors = doors;																						// This keyword is used to distinguish between class variables and instance variables
        this.airbags = airbags;																					// This keyword is used to distinguish between class variables and instance variables
        System.out.println("Name of the Car : " + Name +														// this will print the argument in the next line 
                "\nEngine Type : " + Engine +
                "\nMin Speed in the car :" +minSpeed+
                "\nMax Speed in the car :" +maxSpeed+
                "\nDoors in the car : " + doors +
                "\nAirbags in the car :" +airbags);}
    public void setMaxSpeed(int maxSpeed) {																		// Setter is created 
        this.maxSpeed = maxSpeed;}																				// This keyword is used to distinguish between class variables and instance variables
    public void EngineStopDemo(){																				// method is created 
        Engine Engine = new Engine();																			// new instance is created 
        Engine.stop();}																							// Engine variable is assigned a method
}																												// MercedesBenz class closed