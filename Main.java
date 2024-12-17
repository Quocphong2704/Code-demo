public class Main {

    public static void main(String[] args) {
        int n = 5; // Input size

        // Demonstrate Big-O Notation
        System.out.println("Big-O Notation Example:");
        demonstrateBigONotation(n);

        // Demonstrate Omega Notation
        System.out.println("\nOmega Notation Example:");
        demonstrateOmegaNotation(n);

        // Demonstrate Theta Notation
        System.out.println("\nTheta Notation Example:");
        demonstrateThetaNotation(n);
    }

    // O(n) Example - Worst Case Time Complexity
    public static void demonstrateBigONotation(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Step " + i);
        }
    }

    // Ω(1) Example - Best Case Time Complexity
    public static void demonstrateOmegaNotation(int n) {
        if (n > 0) {
            System.out.println("Best case executed.");
        }
    }

    // Θ(n) Example - Guaranteed Execution n Steps
    public static void demonstrateThetaNotation(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Step " + i);
        }
    }
}
