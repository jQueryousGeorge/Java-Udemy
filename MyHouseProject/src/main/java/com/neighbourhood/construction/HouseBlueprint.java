// 1. Package
// A package is the "address" (folder) where the blueprint is stored
package com.neighbourhood.construction;

/* 
    2. Class
    - A class is essentially a blueprint of a house.
    - A class defines what a 'house' is and what it can do, but the Class is not a real
    house YET.
*/
public class HouseBlueprint {
    /*
     * 3. Fields
     * - Fields are variables. Theyre just "specs"/characteristics
     * - Every house built from this blueprint (Class) will have the properties
     * defined here
     */
    String wallColor;
    int numberOfRooms;
    boolean garageDoorOpen = true;

    // 4. CONSTRUCTOR
    // This is the "Construction Crew."
    // It is a special method that runs only once when you create a new Object.
    public HouseBlueprint(String color, int rooms) {
        this.wallColor = color;
        this.numberOfRooms = rooms;
    }

    // **** 5. METHOD 
    // This is an "Action" or a "Function."
    // It represents something the house (or the things inside it) can do.
    public void closeGarageDoor () {
        garageDoorOpen = false;
        System.out.println("Garage door has been closed.");

    }

    // 6. THE MAIN METHOD
    // This is the "foreman."
    // Every Java program needs a `main( )` method to start the execution.
    public static void main(String[] args) {

        // 7. OBJECT
        // This is the "Actual House."
        // Use the 'new' keyword to turn the Blueprint Class into a real Object in memory.
        HouseBlueprint myHouse = new HouseBlueprint("Blue", 3);

        // 8. CALLING A METHOD
        // This is "Using the House."
        // We tell the specific object (myHouse) to perform an action.
        myHouse.closeGarageDoor();

        System.out.println("My house is " + myHouse.wallColor + " with " + myHouse.numberOfRooms + " rooms.");
    }
}