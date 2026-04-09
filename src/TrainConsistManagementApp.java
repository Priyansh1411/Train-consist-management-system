import java.util.ArrayList;
import java.util.List;
class GoodsBogie {
    String type;   // Cylindrical, Rectangular, etc.
    String cargo;  // Petroleum, Coal, Grain, etc.

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}


public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("========================================");
        System.out.println("   UC12 - Safety Compliance Check");
        System.out.println("========================================\n");

        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        // Try invalid case:
        // goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Display bogies
        System.out.println("Goods Bogies:");
        goodsBogies.forEach(System.out::println);

        // ---- SAFETY VALIDATION ----
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        // Rule: Cylindrical bogie → only Petroleum allowed
                        !b.type.equalsIgnoreCase("Cylindrical")
                                || b.cargo.equalsIgnoreCase("Petroleum")
                );

        // ---- RESULT ----
        System.out.println("\nSafety Compliance Status:");
        if (isSafe) {
            System.out.println("Train is SAFE ✔");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }

        System.out.println("\nUC12 operations completed successfully...");
    }
}
