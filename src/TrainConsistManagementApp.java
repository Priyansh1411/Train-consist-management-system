import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("========================================");
        System.out.println("   UC11 - Regex Validation");
        System.out.println("========================================\n");

        Scanner scanner = new Scanner(System.in);

        // ---- INPUT ----
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ---- REGEX PATTERNS ----
        String trainPatternStr = "TRN-\\d{4}";
        String cargoPatternStr = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainPatternStr);
        Pattern cargoPattern = Pattern.compile(cargoPatternStr);

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // ---- VALIDATION ----
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // ---- OUTPUT ----
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID ");
        } else {
            System.out.println("Train ID is INVALID ");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID ");
        } else {
            System.out.println("Cargo Code is INVALID ");
        }

        scanner.close();

        System.out.println("\nUC11 operations completed successfully...");
    }
}
