package level2;
import java.util.Scanner;

public class PowerCalculationForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent (power): ");
        int exponent = scanner.nextInt();

        if (base < 0 || exponent < 0) {
            System.out.println("Invalid input Base and exponent must be positive integers.");
        } else {
            int result = 1;
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }
       
    }
}
 
