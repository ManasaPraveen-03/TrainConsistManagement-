import java.util.ArrayList;
import java.util.List;

/**
 * ================================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ================================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * This class represents the entry point of the
 * Train Consist Management Application.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Initializes an empty train consist
 * - Adds passenger bogies dynamically using ArrayList
 * - Displays the updated bogie count
 * - Displays the current train consist
 *
 * The goal is to demonstrate startup flow and
 * dynamic addition of bogies using ArrayList.
 *
 * @author ManasaPraveen-03
 * @version 1.0
 */

public class TrainConsistManagementApp {

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

        // UC1 output
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // UC2 - Add passenger bogies
        trainConsist.add("B1");
        trainConsist.add("B2");
        trainConsist.add("B3");

        System.out.println("Passenger bogies added successfully.");
        System.out.println("Updated bogie count: " + trainConsist.size());
        System.out.println("Current train consist: " + trainConsist);
    }
}