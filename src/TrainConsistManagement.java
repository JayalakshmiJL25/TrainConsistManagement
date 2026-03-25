import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
        passengerBogies.add(new Bogie("Sleeper", 72));      // duplicate type
        passengerBogies.add(new Bogie("First Class", 40));
        passengerBogies.add(new Bogie("AC Chair", 56));     // duplicate type

        System.out.println("\nOriginal Bogie List:");
        passengerBogies.forEach(System.out::println);

        // Grouping by bogie type (name)
        Map<String, List<Bogie>> groupedBogies = passengerBogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        System.out.println("\nGrouped Bogies by Type:");

        groupedBogies.forEach((type, bogies) -> {
            System.out.println(type + " -> " + bogies);
        });

        // Verify original list unchanged
        System.out.println("\nOriginal List After Grouping (Unchanged):");
        passengerBogies.forEach(System.out::println);

        System.out.println("\nProgram continues...");
    }
}