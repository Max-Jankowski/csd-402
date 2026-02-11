// Max Jankowski
// Bellevue University
// CSD-402 Module 5 Assignment
// 2/7/2026

public class JankowskiArrayFind {

    /** A bit of confusion that I had is the one dim return vs. the input of a 2
     * dimension input in the (double [][] arrayParm), So I determined that I take a 2D
     * array, search it using nested loops and return a 1D output. I hope this is correct
     */


    public static int[] locateLargest(double[][] arrayParam) { //Part 1
        // initializing the array to store row and column
        // result[0] will be the row, result[1] will be the column
        // resource: https://stackoverflow.com/questions/28507970/locate-the-largest-element-in-a-multidimensional-arrays
        int[] result = new int[2];
        double maxValue = arrayParam[0][0]; //giving a base value to compare
        result[0] = 0;  // row index at the current maximum
        result[1] = 0;  // column at same

        // outside loop going through each row
        for (int row = 0; row < arrayParam.length; row++) {
            // inside loop doing the same for each column in a row
            for (int col = 0; col < arrayParam[row].length; col++) { //comparing element /w the max found thus far
                if (arrayParam[row][col] > maxValue) {
                    // When finding new max #
                    maxValue = arrayParam[row][col];
                    // updating teh location on the current position
                    result[0] = row;
                    result[1] = col;
                }
            }
        }
        return result; //returning the result on the large element
    }


    //Part 2: This is a overload method with the same name but has differnt parameters
    public static int[] locateLargest(int[][] arrayParam) {
        // initializing the the result for storing location
        int[] result = new int[2];
        int maxValue = arrayParam[0][0]; //assumes the element is the biggest to start
        result[0] = 0;
        result[1] = 0;

        // going throuhg the entire '2d' array
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                // Update maximum and location if current element is larger
                if (arrayParam[row][col] > maxValue) { // updating the max and local if current element is deemed larger
                    maxValue = arrayParam[row][col];
                    result[0] = row;
                    result[1] = col;
                }
            }
        }

        return result; // returning the result
    }
    // Part 1 of second section or as I like to call PART 3
    // method to locate the smallest element in a double array
    // same algorithm for the larger then, but used to find the smallest
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] result = new int[2]; //again used to init the result array
        double minValue = arrayParam[0][0]; // just as other parts, assumes the first element is the target/ smallest
        result[0] = 0;
        result[1] = 0;

        // searching through the array
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < minValue) { //using the less than comparison to find the min
                    minValue = arrayParam[row][col];
                    result[0] = row;
                    result[1] = col;
                }
            }
        }

        return result; //return the result of search
    }

    // Part 4 locating the smallest in a integer array, overload method using the same name with integer parameters.
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] result = new int[2]; //array result init
        int minValue = arrayParam[0][0]; //again assumes the start element is the smallest
        result[0] = 0;
        result[1] = 0;

        // Loop to find the min
        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < minValue) {
                    minValue = arrayParam[row][col];
                    result[0] = row;
                    result[1] = col;
                }
            }
        }

        return result;    }


    // main method used to test all 4 proir methods with simple data, output results
    public static void main(String[] args) {
        System.out.println("!!!!! Testing with double array !!!!!");  // testing case, double array with decimals
        double[][] doubleArray = {
                {3.5, 2.1, 9.8, 4.3},
                {5.6, 1.2, 7.4, 8.9},
                {2.3, 6.7, 3.1, 5.5}
        };

        System.out.println("Array contents are:"); // displaying the double array for user reference
        displayArray(doubleArray);

        // finding and displaying the largest element location
        int[] largestLoc = locateLargest(doubleArray);
        System.out.println("\nLargest element location: [" + largestLoc[0] + "][" + largestLoc[1] + "]");
        System.out.println("The value of the largest element at that location is: " + doubleArray[largestLoc[0]][largestLoc[1]]);

        // finding and displaying smallest element location in a double array
        int[] smallestLoc = locateSmallest(doubleArray);
        System.out.println("\nSmallest element location: [" + smallestLoc[0] + "][" + smallestLoc[1] + "]");
        System.out.println("The value of the smallest element at location is: " + doubleArray[smallestLoc[0]][smallestLoc[1]]);

        // testing case 2: integer array
        System.out.println("\n!!!!! Testing with int array !!!!!");
        int[][] intArray = {
                {45, 23, 89, 12},
                {67, 34, 91, 56},
                {78, 90, 23, 44}
        };

        // displaying the array for user
        System.out.println("Array contents:");
        displayArray(intArray);

        // calling the method to find and display the largest in a int array
        largestLoc = locateLargest(intArray);
        System.out.println("\nLargest element location: [" + largestLoc[0] + "][" + largestLoc[1] + "]");
        System.out.println("The value of the largest element at that location is: " + intArray[largestLoc[0]][largestLoc[1]]);

        // calling method to find the smallest elem. in a int array and displaying return
        smallestLoc = locateSmallest(intArray);
        System.out.println("\nSmallest element location: [" + smallestLoc[0] + "][" + smallestLoc[1] + "]");
        System.out.println("The value of the smallest element at location is:" + intArray[smallestLoc[0]][smallestLoc[1]]);

        // Not in requirements, but this calls and  checks with an array of negative numbers. Sorry for being late
        // I know that this was mindless busy work, but thanks for your understanding
        System.out.println("\n!!!!! Testing with negative numbers !!!!!");
        int[][] negativeArray = {
                {-5, -12, -3},
                {-8, -1, -15},
                {-20, -7, -9}
        };

        System.out.println("Array contents:");
        displayArray(negativeArray);

        largestLoc = locateLargest(negativeArray);
        System.out.println("\nLargest element location: [" + largestLoc[0] + "][" + largestLoc[1] + "]");
        System.out.println("The value of the largest element at that location is: " + negativeArray[largestLoc[0]][largestLoc[1]]);

        smallestLoc = locateSmallest(negativeArray);
        System.out.println("\nSmallest element location: [" + smallestLoc[0] + "][" + smallestLoc[1] + "]");
        System.out.println("The value of the smallest element at location is: " + negativeArray[smallestLoc[0]][smallestLoc[1]]);
    }
    // None required mthod to aid in formating a double array into a easy to read format
    // https://stackoverflow.com/questions/29225415/java-2d-array-formatting

    private static void displayArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%6.1f ", array[i][j]);
            }
            System.out.println();
        }
    }
    //Doing likewise for int arrays
    private static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d ", array[i][j]);
            }
            System.out.println();
        }
    }
}
