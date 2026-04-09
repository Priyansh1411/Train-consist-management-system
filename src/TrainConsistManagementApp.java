import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println("   UC8 - Filter Bogies using Streams");
        System.out.println("========================================\n");

        // Create list of bogies (same as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 48));
        bogies.add(new Bogie("Luxury AC", 80));

        // Display original list
        System.out.println("Original Bogie List:");
        bogies.forEach(System.out::println);

        // ---- STREAM FILTER ----
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered list
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Filtering (Unchanged):");
        bogies.forEach(System.out::println);

        System.out.println("\nUC8 operations completed successfully...");
    }
}
