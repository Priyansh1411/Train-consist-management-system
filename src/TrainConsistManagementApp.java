import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("========================================");
        System.out.println("   UC3 - Unique Bogie ID Tracking");
        System.out.println("========================================\n");

        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // ---- ADD (with duplicates intentionally) ----
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display final set (duplicates automatically removed)
        System.out.println("Bogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());

        System.out.println("\nUC3 operations completed successfully...");
    }
}
