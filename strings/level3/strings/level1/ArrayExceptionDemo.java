package level1;
 
import java.util.*;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine();  

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        } 
        System.out.println("\n--- Generating Exception ---");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e);
        } 
        System.out.println("\n--- Handling Exception Safely ---");
        handleException(names);

        sc.close();
    } 
    public static void generateException(String[] arr) {
         
        System.out.println("Accessing invalid index:");
        System.out.println("Name at index " + arr.length + ": " + arr[arr.length]);
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println("Safely accessing invalid index inside try-catch:");
            System.out.println("Name at index " + arr.length + ": " + arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
            System.out.println("Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException!");
            System.out.println("Message: " + e.getMessage());
        }
    }
}
 
