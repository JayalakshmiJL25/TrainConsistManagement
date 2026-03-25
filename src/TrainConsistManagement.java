import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet to maintain order + uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach duplicate bogie
        trainFormation.add("Sleeper"); // Duplicate (will be ignored automatically)

        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        System.out.println("\nTotal Bogies in Formation: " + trainFormation.size());

        System.out.println("\nProgram continues...");
    }
}