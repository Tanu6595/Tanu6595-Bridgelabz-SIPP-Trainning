package level1;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        double[] numbers = new double[10];  // Array to store up to 10 numbers
        double total = 0.0;                  // Variable to store the sum
        int index = 0;                       // To keep track of the number of inputs

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble();

            if (num <= 0) {
                break;  
            }

            if (index == 10) {
                System.out.println("Array is full.");
                break;  
            }

            numbers[index] = num; 
            index++;
        }
 
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
 
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); 
        System.out.println("Sum of all numbers: " + total);

        scanner.close();
    }
}
 
