class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// ---- Passenger Bogie Class ----
class PassengerBogie {
    String type;
    int capacity;

    // Constructor with validation
    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " (Capacity: " + capacity + ")";
    }
}


public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("========================================");
        System.out.println("   UC14 - Custom Exception Handling");
        System.out.println("========================================\n");

        try {
            // ---- VALID BOGIE ----
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + b1);

            // ---- INVALID BOGIE (will throw exception) ----
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            System.out.println("Created: " + b2); // will not execute

        } catch (InvalidCapacityException e) {
            // Handle exception
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 operations completed successfully...");
    }
}
