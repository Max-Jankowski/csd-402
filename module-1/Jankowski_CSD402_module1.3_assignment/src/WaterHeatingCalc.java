//Max Jankowski
//Bellevue University
//CSD-402 Assignment 1.3


// Import the Scanner class so we can read input from the user, as stated in class video
import java.util.Scanner;

// defining the main class, strange for me that a language requires it to funciton
// but im also new to strictly OOP languages.
public class WaterHeatingCalc {

    // the main method that the program uses to start running
    public static void main(String[] args) {

        // creating a scanner object so program can read input
        Scanner input = new Scanner(System.in);

        // asking the user to input amount of water in kg
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();  // reading the number that was input

        // getting starting temp from user
        System.out.print("Enter your initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        // asking to input desired temp
        System.out.print("Enter the desired final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // calculating how much energy it will be to heat water to desired temp
        // based on formulas and info provided by assignment material
        // Q = waterMass * (finalTemperature - initialTemperature) * 4184
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Printing out the amount of enery is required for heat water to desired temo
        System.out.println("The energy needed is " + energy + " Joules");

        // using good practice to close scanner
        input.close();
    }
}