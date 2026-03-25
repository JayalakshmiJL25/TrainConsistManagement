import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagement {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize Train Consist (Dynamic Collection)
        List<String> trainConsist = new ArrayList<>();

        // Display Initial Bogie Count
        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        System.out.println("Program is ready to manage the train consist...");
    }
}