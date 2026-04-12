import java.util.Arrays;
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("==================================================\n");

        // Step 1: Create array of bogie IDs (can be unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Ensure array is sorted (IMPORTANT for Binary Search)
        Arrays.sort(bogieIds);

        // Step 3: Search key
        String key = "BG309";

        // Step 4: Display sorted bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Step 5: Binary Search Logic
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        // Step 6: Display result
        if (found) {
            System.out.println("\nBogie " + key + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + key + " NOT found using Binary Search.");
        }

        System.out.println("\nUC19 search completed...");

    }
}