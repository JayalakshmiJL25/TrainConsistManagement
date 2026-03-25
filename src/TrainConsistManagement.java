import java.util.ArrayList;
import java.util.List;

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
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Reuse Bogie list
        List<Bogie> passengerBogies = new ArrayList<>();

        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 40));
        passengerBogies.add(new Bogie("Luxury Coach", 80));

        System.out.println("\nPassenger Bogies:");
        passengerBogies.forEach(System.out::println);

        // Stream aggregation using map() and reduce()
        int totalSeats = passengerBogies.stream()
                .map(b -> b.getCapacity())     // Extract numeric capacity
                .reduce(0, Integer::sum);      // Aggregate using reduce

        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Aggregation (Unchanged):");
        passengerBogies.forEach(System.out::println);

        System.out.println("\nProgram continues...");
    }
}
