import java.util.HashMap;
import java.util.Map;


public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("========================================");
        System.out.println("   UC6 - Bogie Capacity Mapping");
        System.out.println("========================================\n");

        // Create a HashMap to store bogie and capacity
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // ---- INSERT (Key-Value pairs) ----
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 48);

        // ---- DISPLAY using entrySet ----
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nTotal Bogie Types: " + bogieCapacityMap.size());

        System.out.println("\nUC6 operations completed successfully...");
    }
}
