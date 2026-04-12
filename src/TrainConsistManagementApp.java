public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("==================================================\n");

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Bogie ID to search
        String searchId = "BG309";

        // Step 3: Display all bogies
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Step 4: Linear Search Logic
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break; // Early termination
            }
        }

        // Step 5: Display result
        if (found) {
            System.out.println("\nBogie " + searchId + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchId + " NOT found in train consist.");
        }

        System.out.println("\nUC18 search completed...");

    }
}