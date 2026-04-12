import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("UC17 - Sort Bogie Names Using Arrays.sort()");
        System.out.println("==================================================\n");

        // Step 1: Create an array of bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Step 2: Display original array
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // Step 3: Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Step 4: Display sorted array
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed...");
    }
}
