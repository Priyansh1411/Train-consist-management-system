class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// ---- Goods Bogie Class ----
class GoodsBogie {
    String type;   // Cylindrical / Rectangular
    String cargo;  // Petroleum / Coal / etc.

    GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargo) {
        try {
            // ---- VALIDATION RULE ----
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe Assignment: Rectangular bogie cannot carry Petroleum"
                );
            }

            // If safe → assign cargo
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + this);

        } catch (CargoSafetyException e) {
            // Handle exception gracefully
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + (cargo != null ? cargo : "Nothing");
    }
}



public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("========================================");
        System.out.println("   UC15 - Safe Cargo Assignment");
        System.out.println("========================================\n");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // ---- SAFE ASSIGNMENT ----
        b1.assignCargo("Petroleum");

        // ---- UNSAFE ASSIGNMENT ----
        b2.assignCargo("Petroleum");

        // ---- CONTINUE EXECUTION ----
        b2.assignCargo("Coal");

        System.out.println("Program continues safely...");

        System.out.println("\nUC15 operations completed successfully...");
    }
}
