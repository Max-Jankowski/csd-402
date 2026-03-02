// Max Jankowski
// Bellevue University
// Module 9 assignment part 2

import java.io.File; //Provides the class 'file'
import java.io.FileWriter; // Allows for opening of file and writing characters to it.
import java.io.FileReader; // allowing for reading the file class
import java.io.BufferedReader; // wraps around filereader and loads characters in chunks
import java.io.IOException; // importing exceptions to handle files that are missing or lack permission,
import java.util.Random; //importing to generate random numbers to input into file

public class JankowskiDataFile {
    public static void main(String[] args) {

        File dataFile = new File("data.file");
        Random random = new Random();

        // Try block to write or add 10 random numbers to a data.file
        // using the FileWriter(file, true) for append mode; creates file if it doesn't exist
        try (FileWriter writer = new FileWriter(dataFile, true)) {

            if (!dataFile.exists()) {
                System.out.println("File not found. Creating new file: data.file");
            } else {
                System.out.println("File found. Appending to existing file: data.file");
            }

            // using random number to make 10 numbers
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100); // numbers will be between 0 and 99
                writer.write(randomNumber + " "); //writing random numbers to
            }

            System.out.println("10 random numbers written to data.file.");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // reopening the file and reading the saved data
        System.out.println("\n=== Contents of the data.file ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(dataFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); //displaying content
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

// https://stackoverflow.com/questions/58944201/store-random-numbers-in-a-text-file-java
// had some errors so I did consult this, borrowed a bit, but it is not a direct copy. elements used are fairly basic
