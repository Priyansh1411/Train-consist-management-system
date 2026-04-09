import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("========================================");
        System.out.println("   UC5 - Ordered Unique Train Formation");
        System.out.println("========================================\n");

        // Create LinkedHashSet to maintain order + uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // ---- ADD bogies ----
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // Display final formation
        System.out.println("Final Train Formation (No duplicates, Order preserved):");
        System.out.println(trainFormation);

        System.out.println("\nTotal Unique Bogies: " + trainFormation.size());

        System.out.println("\nUC5 operations completed successfully...");
    }
}
