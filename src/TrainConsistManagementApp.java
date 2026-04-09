import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("========================================");
        System.out.println("   UC13 - Performance Comparison");
        System.out.println("========================================\n");

        // Create large dataset
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", (i % 100) + 1));
        }

        // ---- LOOP-BASED FILTERING ----
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---- STREAM-BASED FILTERING ----
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---- OUTPUT RESULTS ----
        System.out.println("Loop Result Size   : " + loopResult.size());
        System.out.println("Stream Result Size : " + streamResult.size());

        System.out.println("\nExecution Time (nanoseconds):");
        System.out.println("Loop Time   : " + loopTime);
        System.out.println("Stream Time : " + streamTime);

        // ---- VALIDATION ----
        if (loopResult.size() == streamResult.size()) {
            System.out.println("\n✔ Results Match");
        } else {
            System.out.println("\n❌ Results Do Not Match");
        }

        System.out.println("\nUC13 operations completed successfully...");
    }
}
