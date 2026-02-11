// Max Jankowski
// Bellevue University
// CSD-402 Module 6 assignment test code


public class JankowskiFanTestCode {

    public static void main(String[] args) {

        // Creating a header for readability of place in test code
        System.out.println("### Default Fan created ### ");
        System.out.println("-".repeat(40));

        // Using no arguments to generate a default fan object
        JankowskiFan defaultFan = new JankowskiFan();

        System.out.println("\nDefault JankowskiFan (just created):");
        System.out.println(defaultFan);  // Calls to the toString() from main fan class code

        // using a getter method to retrieve and print out state of default fan
        System.out.println("\nUsing Getter Methods:");
        System.out.println("Speed value: " + defaultFan.getSpeed());
        System.out.println("Is on? " + defaultFan.isOn());
        System.out.println("Radius: " + defaultFan.getRadius());
        System.out.println("Color: " + defaultFan.getColor());

        // header for fan object that has non default parameters using a constructor that takes arguments
        System.out.println("\n" + "-".repeat(40));
        System.out.println("#### Creating a new FAN object with passed arguments #####");
        System.out.println("-".repeat(40));

        // using a contsructor to create fan object using arguments to set parameters
        JankowskiFan newFan = new JankowskiFan(JankowskiFan.FAST, true, 18.0, "brown");

        System.out.println("\nNew JankowskiFan (just created):"); // displaying creation of new fan
        System.out.println(newFan);

        // Using setters to modify the state of the default fan
        System.out.println("\n#### Using setters to change default fan state. #### ");
        System.out.println("-".repeat(40));

        // Turn the default fan on
        System.out.println("\nTurning default fan ON and setting to MEDIUM speed...");
        defaultFan.setOn(true); //Changing the boolean values of is on to true
        defaultFan.setSpeed(JankowskiFan.MEDIUM);
        System.out.println(defaultFan);

        // color
        System.out.println("\nChanging color to green.");
        defaultFan.setColor("green");
        System.out.println(defaultFan);

        // radius
        System.out.println("\nChanging radius to 10 inches.");
        defaultFan.setRadius(10.0);
        System.out.println(defaultFan);


        // This is an extra section, more of a best practice rather then requirement of assignment
        // Would be useful if there was a scanner class to retrieve input from user in fan class
        System.out.println("\n" + "-".repeat(40));
        System.out.println("Extra section using method of validating inputs.");
        System.out.println("-".repeat(40));

        // All should return error when passing an invalid argument to setters for default fan
        // Would be useful in checking validation code in Fan Class coding
        System.out.println("\nAn attempt to set invalid speed (5):");
        defaultFan.setSpeed(5);  // setting speed outside of tolerance

        System.out.println("\nAn attempt to set negative radius (-5):");
        defaultFan.setRadius(-5);  // setting speed argument with a negative number

        System.out.println("\nAn attempt to set empty color:");
        defaultFan.setColor("");  // setting empty color will result in error and maintain default value

        System.out.println("\n An attempt to set null color:");
        defaultFan.setColor(null);  // error when null



    }
}
