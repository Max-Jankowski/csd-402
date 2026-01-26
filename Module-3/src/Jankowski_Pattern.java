// Max Jankowski
// CSD 402
// Module 3 assignment


// Program to display a pyramid pattern using powers of 2
// had many issues with alignment, see below for resources used
public class Jankowski_Pattern {

    // The main method is where the program starts
    public static void main(String[] args) {

        // declaring total rows in the pyramid
        int rows = 7;

        // the outer loop: controlling which row program is on
        for (int i = 1; i <= rows; i++) {

            // 1st inner loop: prints leading spaces for alignment
            // every row needs (rows - i) * 2 spaces before the numbers
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");
            }

            // 2nd inner loop: prints the ascending numbers (powers of 2)
            // Starts at 2 to pow of 0 = 1 and goes up to 2 to power of (i-1)
            for (int k = 0; k < i; k++) {
                // Calculating 2 raised to the power of k
                int value = (int) Math.pow(2, k);
                System.out.print(value + " ");
            }

            // 3rd inner loop: prints the descending numbers (powers of 2)
            // Starts at 2^(i-2) and goes down to 2^0 = 1
            for (int k = i - 2; k >= 0; k--) {
                // Calculate 2 raised to the power of k
                int value = (int) Math.pow(2, k);
                System.out.print(value + " ");
            }

            // 4th inner loop: print trailing spaces to keep @ in fixed column
            // this was the hardest part that took the most time to figure out
            // Pattern: (rows - i) * 2 spaces
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");
            }

            // Print the @ symbol at the end of each line
            System.out.println("@");
        }
    }
}

/* Resources: Used for pyramid structure
    https://www.geeksforgeeks.org/java/programs-printing-pyramid-patterns-java/
    https://www.programiz.com/java-programming/examples/pyramid-pattern
     */