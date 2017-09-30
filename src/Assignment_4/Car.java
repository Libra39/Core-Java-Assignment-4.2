/**
 *      ---------
 *		|  Car  |  -------------------------
 * 		---------							|
 * 			|								|-- Has- A RelationShip
 * 			|-- Is- A RelationShip			|  
 * 			|								|
 * 	  ----------------					-----------
 * 	  | MercedesBenz |------------------|  Engine |    
 *    ----------------		  |			-----------
 *    						  |	
 * 						Has- A RelationShip
 */
package Assignment_4;												// Package Declared
public class Car {													// Class Declared
    private String Name;											// Private string variable initiated
    private String Engine;											// Private string variable initiated
    private int minSpeed;											// Private Integer variable initiated
    public Car() {}													// Non- Argument method declared
    public Car(String Name, String Engine, int minSpeed) {			// 3 parameter Argument method declared
        this.minSpeed= minSpeed;}									// This keyword is used to distinguish between class variables and instance variables
    public void EngineStartDemo() {									// New Method created
        Engine Engine = new Engine();								// new instance created
        Engine.start();}											// variable assign to the start() method
    public void carInfo(){											// New Method created
        System.out.println("Default Car Name = "+Name + 			// This will print the argument in the next line
        		"\nDefault Engine Type = "+Engine+
        		"\nMinimum Speed= " + minSpeed);}
    public void setName(String name) {								// setter created
        Name = name;}
    public void setEngine(String engine) {							// setter created
        Engine = engine;}
    public void setMinSpeed(int minSpeed) {							// setter created
        this.minSpeed = minSpeed;}
}																	// Class Assignment_4 closed
