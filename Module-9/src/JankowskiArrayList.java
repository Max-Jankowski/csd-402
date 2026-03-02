// Max Jankowski
// Bellevue University
// Module 9 assignment part 1


import java.util.ArrayList;
import java.util.Scanner;

public class JankowskiArrayList {
    public static void main(String[] args) {

        // Creating an array and filling it with 10 strings, fruit my daughter likes
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Sweet Plum");
        fruits.add("Elderberry");
        fruits.add("Watermelon");
        fruits.add("Grape");
        fruits.add("Honeydew");
        fruits.add("Kiwi");
        fruits.add("Tangerine");

        // making a for-each loop to print each element in the array
        System.out.println("=== Fruit List ===");
        int index = 0;
        for (String fruit : fruits) {
            System.out.println(index + ": " + fruit);
            index++;
        }

        // as per instruction, using scanner and asking user which string to see again
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index number of the element you would like to see again: ");
        String userInput = scanner.nextLine();

        // sting input into an int, then box it into a Integer object
        // integer object is automatically unboxed back to int when used in .get()
        try {
            Integer boxedIndex = Integer.parseInt(userInput); // autobox int to 'Integer'
            int unboxedIndex = boxedIndex;                    // auto unboxing Interger to int
            System.out.println("You selected: " + fruits.get(unboxedIndex));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds, Restart Program"); // Did have the requirement to continue to
        } catch (NumberFormatException e) {                                         // ask user to re-enter entry, so I decided to not go beyond requirements.
            System.out.println("Exception thrown: Out of Bounds, Restart Program"); // printing that exception has been thrown and shutting program down.
        }

        scanner.close();
    }
}