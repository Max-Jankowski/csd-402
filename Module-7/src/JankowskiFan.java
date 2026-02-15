// Max Jankowski
// Bellevue University
// CSD-402 Module 7 assignment (updated from Module 6)
// 2/13/2026

// Much of the code is the same as module 6
// Last section that defined toString method has been commented out

public class JankowskiFan { // Making the class fan, it represents a simulation of a physical fan
    // elements include speed, color, size and an on/off state

    // constants speed setting, these simulate 4 possible speeds. Satisfies requirement 1
    public static final int STOPPED = 0;  // fan is off or not spinning
    public static final int SLOW = 1;     // lowest speed
    public static final int MEDIUM = 2;   // mid speed
    public static final int FAST = 3;     // high speed

    // Private fields
    // The current speed of the fan - can be one of the four settings above
    private int speed;

    // indicates weather fan is on or off, if set to fast, if this field is false, the same will not 'spin'
    private boolean on;

    // Requirement 4: Using inches to represent the fan's size
    private double radius;

    // Requirement 5: Private field representing fan's color stored as a string
    private String color;

    // Constructors, starting with the no argument constructor that creates object with default class settings
    public JankowskiFan() {
        this.speed = STOPPED; //using the 'this' to refer to the instance variables
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }
    // constructor that takes arguments and sets object properties. 'this' keyword used to differitate between
    // the instance variable and the parameter, https://www.w3schools.com/java/ref_keyword_this.asp
    public JankowskiFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    // Getters methods to retrive state
    // this method returns the current speed of the object, this is read only
    public int getSpeed() { // modified from last module, using this selection
        // adding 'this' to explicitly show it;ss returning THIS object's speed
        return this.speed;
    }
    public boolean isOn() {
        // Once again modified to use 'this'
        return this.on;
    }

    public double getRadius() {
        // getting 'this' fans radius
        return this.radius;
    }

    public String getColor() {
        // 'this' fans color
        return this.color;
    }

    // Setter methods, unlike getters these have write access to the object
    // following best practice I added validation to ensure input is a valid selection

    // Setter method
    public void setSpeed(int speed) {
        // Validate that speed input is one of the four allowed values
        if (speed >= STOPPED && speed <= FAST) {
            // 'this.speed' refers to instance variable 'speed' (without this) refers to parameter
            this.speed = speed;
        } else {
            // Input will be pre-determined, but this code is to trigger should, code be used /w user input
            System.out.println("Invalid speed setting. Must be 0-3.");
            System.out.println("Current speed unchanged: " + this.speed);
        }
    }

    public void setOn(boolean on) {
        this.on = on; // 'this' to separate the instance variable from a parameter
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius; //same use as last module
        } else { // keeping current radius is entry invalid
            System.out.println("Radius must be positive.");
            System.out.println("Current radius unchanged: " + this.radius);
        }
    }

    public void setColor(String color) {
        if (color != null && !color.trim().isEmpty()) { //validation that there is an input and not left empty
            this.color = color;
        } else { // If invalid, keep current color
            System.out.println("Color cannot be null or empty.");
            System.out.println("Current color unchanged: " + this.color);
        }
    }

    // Methods to help to return fan states as readable string
    // adding this method makes the toString method more readable for user
    public String getSpeedString() { //Changed to public, to allow access for useFans
        switch (this.speed) { // modified from mod 6, using 'this.speed' to explicitly show we're checking THIS fan's speed
            case STOPPED:
                return "STOPPED";
            case SLOW:
                return "SLOW";
            case MEDIUM:
                return "MEDIUM";
            case FAST:
                return "FAST";
            default:
                return "UNKNOWN";
        }
    }

    //Method to return state of fan into a readable string representation, called printing using System.out
    // or concatenation is involved in regards to JankowskiFan

    /**
     * Commented out, to satisfy the requirement of not using the toString Method
     * @Override
    public String toString() {
        // Using 'this' to access all instance variables
        if (this.on) {
            // When fan is 'On', show details about operation
            return "JankowskiFan Status: ON\n" +
                    "  Speed: " + this.getSpeedString() + " (" + this.speed + ")\n" +
                    "  Color: " + this.color + "\n" +
                    "  Radius: " + this.radius + " inches";
        } else {
            // When fan state is off, speed details not needed
            return "JankowskiFan Status: OFF\n" +
                    "  Color: " + this.color + "\n" +
                    "  Radius: " + this.radius + " inches";
        }
    }*/
}