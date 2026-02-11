// Max Jankowski
// Bellevue University
// CSD-402 Module 6 assignment
// 2/9/25

public class JankowskiFan { //Making the class fan, it represents a simulation of a physical fan
    // elements include speed, color, size and an on/off state

    // constants speed setting, these simulate 4 possible speeds. Satisfies requirement 1
    public static final int STOPPED = 0;  // the fan is off or not spinning
    public static final int SLOW = 1;     // lowest speed
    public static final int MEDIUM = 2;   // mid speed
    public static final int FAST = 3;     // high speed

 // Private fields
    // the current speed of the fan, it can be one of the four settings listed above
    // satisfies requirement 2 with relation to private fields
    private int speed;

    // indicates weather fan is on or off, if set to fast, if this field is false, the same will not 'spin'
    // requirement 3
    private boolean on;

    // requirement 4, using inches represents the fan's size, larger fans generate larger air movement
    private double radius;

    // requirement 5, Private field that represents fans color stored in a string
    private String color;

    // requirements 7 and 8 for constructors
    // no argument const, called when object of fan is created with no parameter inputs
    // has defaults set to stopped, fan off, rad 6in not the biggest fan, and white in color
    public JankowskiFan() {
        this.speed = STOPPED;
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

    // requirement 6 getter and setter methods, https://www.youtube.com/watch?v=QeiYjcMkQ1U

    // this method returns the current speed of the object, this is read only
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() { //getter method to return on/off state of fan
        return on;
    }

    public double getRadius() { // getter method for fan radius
        return radius;
    }

    public String getColor() { //getter method to return stored string representing color of fan
        return color;
    }

    // Setter methods, unlike getters these have write access to the object
    // following best practice I added validation to ensure input is a valid selection

    // Setter method
    public void setSpeed(int speed) { //setter method for fan speed
        // validating that speed input is one of the four allowed values, This is just a best practice
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        } else {
            // Input will be pre-determined, but this code is to trigger should, code be used /w user input
            System.out.println("Invalid speed setting. Must be 0-3.");
            System.out.println("Current speed unchanged: " + this.speed);
        }
    }

    public void setOn(boolean on) { //setter to set the on or off switch,
        this.on = on;
    }

    public void setRadius(double radius) { //setting the size of the fan
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
            System.out.println("Current radius unchanged: " + this.radius);
        }
    }

    public void setColor(String color) { //setter to set color of fan, will include validation.
        if (color != null && !color.trim().isEmpty()) { //validation that there is an input and not left empty
            this.color = color;
        } else {
            System.out.println("Color cannot be null or empty.");
            System.out.println("Current color unchanged: " + this.color);
        }
    }

    // Methods to help to return fan states as readable string
    // adding this method makes the toString method more readable for user
    private String getSpeedString() {
        switch (speed) {
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

    //@Override
    //Method to return state of fan into a readable string representation, called printing using System.out
    // or concatenation is involved in regards to JankowskiFan
    public String toString() {
        if (on) {
            // When fan is 'On' shows details about operation
            return "JankowskiFan Status: ON\n" +
                    "  Speed: " + getSpeedString() + " (" + speed + ")\n" +
                    "  Color: " + color + "\n" +
                    "  Radius: " + radius + " inches";
        } else {
            // when fan state off, speed details not needed
            return "JankowskiFan Status: OFF\n" +
                    "  Color: " + color + "\n" +
                    "  Radius: " + radius + " inches";
        }
    }
}