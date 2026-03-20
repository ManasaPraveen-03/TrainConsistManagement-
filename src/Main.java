import java.util.ArrayList;
import java.util.List;

/**
 * ================================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ================================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the
 * Train Consist Management Application.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Initializes an empty train consist
 * - Displays the initial bogie count
 *
 * No bogie addition logic is implemented yet.
 *
 * The goal is to establish the application startup flow
 * and dynamic collection initialization.
 *
 * @author ManasaPraveen-03
 * @version 1.0
 */

public class Main {

    /**
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist using ArrayList
        List<String> trainConsist = new ArrayList<>();

        // Display consist summary
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());
    }
}