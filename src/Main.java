import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ================================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ================================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 * Use Case 2: Add Passenger Bogies to Train
 * Use Case 3: Track Unique Bogie IDs
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
 * - Tracks unique bogie IDs using HashSet
 * - Displays the updated bogie count
 * - Displays the current train consist
 * - Prevents duplicate bogie IDs
 *
 * The goal is to demonstrate startup flow,
 * dynamic addition of bogies, and uniqueness
 * handling using Set and HashSet.
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

        // UC1 - Initialize empty train consist using ArrayList
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // UC2 - Add passenger bogies
        trainConsist.add("B1");
        trainConsist.add("B2");
        trainConsist.add("B3");

        System.out.println("Passenger bogies added successfully.");
        System.out.println("Updated bogie count: " + trainConsist.size());
        System.out.println("Current train consist: " + trainConsist);

        // UC3 - Track unique bogie IDs using HashSet
        Set<String> uniqueBogieIds = new HashSet<>();

        uniqueBogieIds.add("B1");
        uniqueBogieIds.add("B2");
        uniqueBogieIds.add("B3");
        uniqueBogieIds.add("B2"); // Duplicate entry
        uniqueBogieIds.add("B1"); // Duplicate entry

        System.out.println("Unique bogie IDs tracked successfully.");
        System.out.println("Unique bogie count: " + uniqueBogieIds.size());
        System.out.println("Unique bogie IDs: " + uniqueBogieIds);
    }
}