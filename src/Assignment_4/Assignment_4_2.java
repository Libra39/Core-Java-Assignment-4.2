
package Assignment_4;																	//Package Declared
/*
 * Write a program in java to show the difference between is-a relationship and has-a relationship and also show which one is better. 
 * The Program created have Following Relationship
 *     
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
 * 
 * Has-a relationship is composition relationship which is a productive way of code reuse.
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
public class Assignment_4_2 {															  // Class Declared
public static void main(String[] args) {												  // Main Method Start
		System.out.println("\nThe program in java to show the difference "				  // This will print the argument in the Next line
				+ "between is-a relationship and has-a relationship "
							+ "and also show which one is better.\n");
		Car car = new Car();															   // new Instance is created to call car() method
        car.EngineStartDemo();														       // car variable is used to call EngineStartDemo()
        MercedesBenz myMercedesBenz = new MercedesBenz("MercedesBenz","V12",80,370,4,4);   // new Instance is created to call values from MercedesBenz() 6 parameter constructor
        myMercedesBenz.setName("MercedesBenz Prototype");								   // Setter method setName() of MercedesBenz is Called and passed a value
        System.out.println("******************************************");				   // This will print the argument in the Next line
        myMercedesBenz.setEngine("V6");													   // Setter method setEngine() of MercedesBenz is Called and passed a value
        myMercedesBenz.setMaxSpeed(350);												   // Setter method setMaxSpeed() of MercedesBenz is Called and passed a value
        myMercedesBenz.setMinSpeed(80);													   // Setter method setMinSpeed() he argument in the Next line
        myMercedesBenz.carInfo();														   // Setter method carInfo() of MercedesBenz is Called
        myMercedesBenz.EngineStopDemo();												   // Method EngineStopDemo() of MercedesBenz is Called
	}																					   // Main Method Closed
}																						   // Assignment_4_2 class closed



/*Difference
Has-a relationship. - It’s the relationship between objects.
Is-a relationship. - It’s the relationship between classes.

Has-a relationship. - Composing object holds a reference to composing classes and hence relationship is loosely bound.
Is-a relationship. - Derived object carries the base class definition in itself and hence its tightly bound.

Has-a relationship. - Used in Dependency Injection
Is-a relationship. - Used in Runtime Polymorphism

Has-a relationship. - Single class objects can be composed within multiple classes.
Is-a relationship. - Single class can only inherit one Class.
 */


