import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // Adding Passenger Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Removing a Bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        System.out.println("\nPassenger Bogies after removal of AC Chair:");
        System.out.println(passengerBogies);

        // Checking existence of Sleeper bogie
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train consist.");
        } else {
            System.out.println("\nSleeper bogie does not exist in the train consist.");
        }

        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram continues...");
    }
}