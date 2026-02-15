// Max Jankowski
// Bellevue University
// CSD-402 Module 7 assignment
// 2/13/2026


// Main purpose for code is to demo the use of collections. For this reason I didn't include object modification,
// which was included in last week's module
// Rather I included modification of the collection. I hope this was a correct assumption Professor Payne

import java.util.ArrayList; //added to allow for creation of array collections


public class UseFans { // class to use collection of objects in the fan class

    //Method to display fans in collection
    public void displayFanCollection(ArrayList<JankowskiFan> fans) { //validating if there are fans to diplay
        if (fans == null || fans.isEmpty()) {
            System.out.println("No fans in collection to display."); // displaying that no fans have been created
            return;
        }

        System.out.println(); //blank space for providing some headroom for formating display
        System.out.println("--- DISPLAYING FAN COLLECTION (" + fans.size() + " fans) ---");
        System.out.println("*".repeat(50));

        // loop through each fan object in collection
        int fanNumber = 1;
        for (JankowskiFan fan : fans) {
            System.out.println("\n--- Fan #" + fanNumber + " ---");
            displaySingleFan(fan); // call to display fan in collection while not using toString
            fanNumber++;
        }
    }

    // displaying info about each fan instance w/o using toString
    public void displaySingleFan(JankowskiFan fan) {
        if (fan == null) { // valitation that object is not null before accessing
            System.out.println("Error: Cannot display null fan object.");
            return;
        }

        // using getter to display fan status 'off' or 'on'
        if (fan.isOn()) {
            System.out.println("Status: ON");
            // if the fan is on, then display speed getter
            System.out.println("Speed: " + fan.getSpeedString() +
                    " (value: " + fan.getSpeed() + ")");
        } else {
            System.out.println("Status: OFF"); //if the fan is off the speed is irrelevant to retrieve
        }

        // displaying other properties using getter methods
        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius() + " inches");
    }

    // the main method creates a collection of fans, adds these object o a collection, display both indiv. and full collection
    public static void main(String[] args) { // Creating a instance of UseFans to call methods
        UseFans fanDisplay = new UseFans();

        System.out.println("### Working with Fan Collections ###\n");

      // Formating a display to inform what part of code is being worked on
        System.out.println("---- PART 1: Lets Make Some Fans !!------");
        System.out.println("*".repeat(50));

        ArrayList<JankowskiFan> fanCollection = new ArrayList<>(); // Creating an array to store our fan objects, requirement 1

        JankowskiFan fan1 = new JankowskiFan(); // Creating fan 1 using no arguments, parameters will be default
        System.out.println("\nCreated Fan #1 (default settings)");
        fanCollection.add(fan1);  // adding this object to the array

        // creating a fan2, passing along arguments
        JankowskiFan fan2 = new JankowskiFan(
                JankowskiFan.FAST,true,18.0,"black"
        );
        System.out.println("Created Fan #2 (FAST, ON, 18\", black)"); //informaing user of the creation of object 2
        fanCollection.add(fan2);  // adding fan 2 to array

        // object 3 creation
        JankowskiFan fan3 = new JankowskiFan(
                JankowskiFan.MEDIUM,true,12.0,"blue"
        );

        System.out.println("Created Fan #3 (MEDIUM, ON, 12\", blue)"); // displaying and storing in array
        fanCollection.add(fan3);

        // Fan object 4
        JankowskiFan fan4 = new JankowskiFan(
                JankowskiFan.SLOW,false,10.0,"red"
        );

        System.out.println("Created Fan #4 (SLOW, OFF, 10\", red)"); //Dispaly and store
        fanCollection.add(fan4);

        // Creating fan5, this fan created then modified with setters
        JankowskiFan fan5 = new JankowskiFan();
        fan5.setSpeed(JankowskiFan.FAST);
        fan5.setOn(true);
        fan5.setRadius(24.0);
        fan5.setColor("green");
        System.out.println("Created Fan #5 (FAST, ON, 24\", green) - built with setters");
        fanCollection.add(fan5);  // Add to collection

        System.out.println("\nTotal fans in collection: " + fanCollection.size()); //Printing out how many fans are in the collection

        // Diplaying a single fan instance
        System.out.println("\n\nDisplaying Single Fan Instance");
        System.out.println("*".repeat(50));

        System.out.println("\nStatus of Fan #2:");
        System.out.println("-".repeat(30));

        // calling method to display a single fan
        fanDisplay.displaySingleFan(fan2);

        // Displaying all the fans in the collection, Method has display notice written in method
        // Call to method to go through array and display info on all fans in the collection
        fanDisplay.displayFanCollection(fanCollection);


        //This part is extra, but it shows how fans can be removed from the collection
        System.out.println("\n\n--- Removing Fan from Collection ---");
        System.out.println("*".repeat(50));

        System.out.println("\nRemoving Fans 2,3 and 4 from the collection...");
        fanCollection.remove(fan2);
        fanCollection.remove(fan3);
        fanCollection.remove(fan4);  // removed 3 fans leaving only 1 and 5
        System.out.println("New collection size: " + fanCollection.size()); // displaying how many fans are left in the collection

        System.out.println("\nHere is the modified final collection:");
        fanDisplay.displayFanCollection(fanCollection);

    }
}