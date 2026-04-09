import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString() for printing
    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}


public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("========================================");
        System.out.println("   UC7 - Sort Bogies by Capacity");
        System.out.println("========================================\n");

        // Create a List to store bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // ---- ADD bogies ----
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 48));

        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ---- SORT using Comparator (ascending order) ----
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
        System.out.println("\nUC7 operations completed successfully...");
    }
}
