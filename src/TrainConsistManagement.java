import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie: " + name + " | Capacity: " + capacity;
    }
}

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Reusing Bogie list (similar to UC7)
        List<Bogie> passengerBogies = new ArrayList<>();

        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 40));
        passengerBogies.add(new Bogie("Luxury Coach", 80));

        System.out.println("\nOriginal Bogie List:");
        passengerBogies.forEach(System.out::println);

        // Define capacity threshold
        int threshold = 70;

        // Stream Filtering (capacity > threshold)
        List<Bogie> filteredBogies = passengerBogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > " + threshold + "):");
        filteredBogies.forEach(System.out::println);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Filtering (Unchanged):");
        passengerBogies.forEach(System.out::println);

        System.out.println("\nProgram continues...");
    }
}