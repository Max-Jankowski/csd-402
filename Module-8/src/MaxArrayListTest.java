// Max Jankowski
// Bellevue University
// CSD-402
// Module 8 assignment


//Making a simple method that takes int from user until hey hit '0' and add them to arraylist,
// pull the highest number and display

import java.util.ArrayList;   // importing array list from util package
import java.util.Scanner;     // Used for getting user input

public class MaxArrayListTest {

    // using <Integer> instead of <int> to have access o inheritance methods, based on units topic
    // Conversion between int and integer is handled via autoboxing https://www.geeksforgeeks.org/java/autoboxing-unboxing-java/
    public static Integer max(ArrayList<Integer> list) {

        //is statement to return 0 if the list is empty , checked first before any iteration to prevent errors
        if (list.isEmpty()) {
            return 0;  // Return Integer value of 0 (autoboxed from int literal)
        }


        // initializing the maxValue variable to first element on the lst 'list.get()' that returns interger object
        //this IS- A number and comparable
        Integer maxValue = list.get(0);

         //looping through the numbers in array. note num is a declared INT that inherits compareTo() from comparable
        for (Integer num : list) {

            // Compare current number to the current max
            // Unboxing converts Integer -> int for the '>' comparison
            if (num > maxValue) {
                maxValue = num;  // Update maxValue if a larger number is found
            }
        }

        // Returning the largest value found
        return maxValue;
    }

    //Method to enter program handles input from user and adds to arrayList, calls max() method and displays
    public static void main(String[] args) {

        // creating scanner object to collect user entry
        Scanner scanner = new Scanner(System.in);

        // Declaring the list to hold integer objects. ArrayList<Integer> uses interface for List<Integer>
        //that allows for inheriting add(), isEmpty(), get(), from parent interface
        //https://www.geeksforgeeks.org/java/arraylist-in-java/

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers to add to the list.");
        System.out.println("Enter 0 to stop input.\n");

        // Loop that allows for getting user input until '0' is selected
        while (true) {
            System.out.print("Enter a number: ");

            //Read the next int from user, ArrayList requires Interger object, while scanner returns a primitive int
            // Using autoboxing from the add() call, Java 'boxes' the int into an Integer.
            int input = scanner.nextInt();

            // Add the value to the ArrayList, autoboxing add()
            numbers.add(input);

            // if statment that has a break when user inputs 0
            if (input == 0) {
                break;
            }
        }

        // closing scanner and releasing the resources
        scanner.close();

        //calling the max() method and passing on the array list
        Integer result = max(numbers);


        // Displaying results from user entry
        System.out.println("\nThe largest value in the list is: " + result);


        // Displaying that this section is for 'testing'
        System.out.println("\n####  This Section is For Running Tests ####");


        // Checking an empty array, result should be 0
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("Empty List Test - Empty list (expect 0): " + max(emptyList));

        // Testing a basic list, 77 should come up as highest
        ArrayList<Integer> testList = new ArrayList<>(); //next lines are adding numbers to array as if user enter them
        testList.add(3);
        testList.add(77);
        testList.add(12);
        testList.add(45);
        testList.add(0); //adds 0 and causes break for if statement
        System.out.println("Basic List Test - List [3, 77, 12, 45, 0] (expect 77): " + max(testList));

        // Testing list with negative numbers
        ArrayList<Integer> negativeList = new ArrayList<>();
        negativeList.add(-5);
        negativeList.add(-2);
        negativeList.add(-8);
        negativeList.add(0);
        System.out.println("Negative Numbers Test - List [-5, -2, -8, 0] (expect  0): " + max(negativeList));

    }

}
