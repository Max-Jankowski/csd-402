/**
 * Max Jankowski
 * Bellevue University
 * CSD-402
 * Module 4 assignment
 */




public class JankowskiAverCalc { //al four methods are using the same logic bu are working with
                        // varing types of data
                        // This is where I got  a bit confused, as it the same method but uses
                        // different parameters

    // Calculates the average of a short array  part 1
    public static short average(short[] array) {
        if (array == null || array.length == 0) {
            return 0; // checks for null or emty arrays to prevent crashes
        }

        long sum = 0; // hold sum to prevent overflow
        for (short num : array) { //loops each element and adds to sum
            sum += num;
        }

        return (short) (sum / array.length);
    }

    //Calculates the average of an int array part 2
    public static int average(int[] array) {
        if (array == null || array.length == 0) { // again checking for null
            return 0;
        }

        long sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (int) (sum / array.length);
    }

    // Calculates the average of a 'long array' part 3

    public static long average(long[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        long sum = 0;
        for (long num : array) {
            sum += num;
        }

        return sum / array.length;
    }

    // Calculates the average of a "double array" part 4

    public static double average(double[] array) {
        if (array == null || array.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }

        return sum / array.length;
    }

    // Utility method to print a short array using the format
    // [elem1, elem2 ....]
    public static void printArray(short[] array) {
        System.out.print("["); // the opening bracket
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]); //printig the current element
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]"); //closing bracket
    }

    // Method to print a int array using same as above format
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    //Utility method for part 3 "the long array" uses the same basic formating
    public static void printArray(long[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    //The final util method to test part 4 the double array
    public static void printArray(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f", array[i]); //printing to 2 decimal spaces
            if (i < array.length - 1) { // adding space and comma after elements
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    // Main method to run tests on overload averages methods
    // used following sources outside of class material
    // https://www.geeksforgeeks.org/java/java-program-to-use-method-overloading-for-printing-different-types-of-array/
    // https://stackoverflow.com/questions/22119541/java-overloading-array-methods-for-specific-types

    public static void main(String[] args) {
        // Printing the header for readiblity
        System.out.println("=".repeat(70));
        System.out.println("           OVERLOADED AVERAGE METHOD DEMO");
        System.out.println("=".repeat(70));
        System.out.println();

        // Test  for part 1: short array, has 3 elements
        System.out.println("TEST ONE: SHORT ARRAY ---3 elements---");
        System.out.println("-".repeat(70));
        short[] shortArray = {10, 20, 30};
        System.out.print("Original Array: ");
        printArray(shortArray);
        System.out.println();
        short shortAvg = average(shortArray);
        System.out.println("Average: " + shortAvg);
        System.out.println();

        // Test for part 2, int array
        System.out.println("TEST TWO: INT ARRAY WITH ---5 elements---)");
        System.out.println("-".repeat(70));
        int[] intArray = {100, 200, 300, 400, 500};
        System.out.print("Original Array: ");
        printArray(intArray);
        System.out.println();
        int intAvg = average(intArray);
        System.out.println("Average: " + intAvg);
        System.out.println();

        // Test for part 3, the long array
        System.out.println("TEST THREE: LONG ARRAY ---7 elements---");
        System.out.println("-".repeat(70));
        long[] longArray = {1000L, 2000L, 3000L, 4000L, 5000L, 6000L, 7000L};
        System.out.print("Original Array: ");
        printArray(longArray);
        System.out.println();
        long longAvg = average(longArray);
        System.out.println("Average: " + longAvg);
        System.out.println();

        // Test for method 4, the double array
        System.out.println("TEST FOUR: DOUBLE ARRAY ---4 elements---");
        System.out.println("-".repeat(70));
        double[] doubleArray = {10.5, 20.75, 30.25, 40.5};
        System.out.print("Original Array: ");
        printArray(doubleArray);
        System.out.println();
        double doubleAvg = average(doubleArray);
        System.out.printf("Average: %.2f%n", doubleAvg); // 2 decimal formating
        System.out.println();

        // Print ending footer for use of knowing where prog ends
        System.out.println("=".repeat(70));
        System.out.println("           ALL TESTS COMPLETED SUCCESSFULLY");
        System.out.println("=".repeat(70));
    }
}
//Im almost positive that there was an easier way to run the overload test, but I was under a bit of a time crunch
// and I needed to get some test on the screen