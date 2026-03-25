import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for Bogie IDs (Ensures Uniqueness)
        Set<String> bogieIds = new HashSet<>();

        // Adding Bogie IDs (Including Duplicates Intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        System.out.println("\nBogie IDs after insertion (duplicates ignored automatically):");
        System.out.println(bogieIds);

        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());

        System.out.println("\nProgram continues...");
    }
}