package level1;
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double num = scanner.nextDouble();
            if (num == 0) break;
            total += num;
        }

        System.out.println("Total sum: " + total);
        
    }
}
 
