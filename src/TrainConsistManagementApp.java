import java.util.ArrayList;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}




public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("========================================");
        System.out.println("   UC10 - Total Seating Capacity");
        System.out.println("========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 48));
        bogies.add(new Bogie("Luxury AC", 80));

        // Display original list
        System.out.println("Train Bogies:");
        bogies.forEach(System.out::println);

        // ---- STREAM AGGREGATION ----
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Aggregation (Unchanged):");
        bogies.forEach(System.out::println);

        System.out.println("\nUC10 operations completed successfully...");
    }
}
