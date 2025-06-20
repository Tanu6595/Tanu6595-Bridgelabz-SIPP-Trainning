 package level1;

public class NullPointerDemo {
    public static void main(String[] args) {
        System.out.println("--- Generating exception without handling ---");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n--- Now handling the exception properly ---");
        handleException();
    }

    // Method that throws NullPointerException (not handled here)
    public static void generateException() {
        String text = null;
        System.out.println("Attempting to get text length:");
        System.out.println("Length of text: " + text.length()); // This throws NPE
    }

    // Method that handles NullPointerException using try-catch
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Attempting to get text length safely:");
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException!");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}