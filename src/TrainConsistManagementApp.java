import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
        System.out.println("   UC9 - Group Bogies by Type");
        System.out.println("========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 72));      // duplicate type
        bogies.add(new Bogie("First Class", 48));
        bogies.add(new Bogie("AC Chair", 60));     // duplicate type

        // Display original list
        System.out.println("Original Bogie List:");
        bogies.forEach(System.out::println);

        // ---- GROUPING USING STREAM ----
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("\nGrouped Bogies by Type:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("Type: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
            System.out.println();
        }

        // Verify original list unchanged
        System.out.println("Original List After Grouping (Unchanged):");
        bogies.forEach(System.out::println);

        System.out.println("\nUC9 operations completed successfully...");
    }
}
