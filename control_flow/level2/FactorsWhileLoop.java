package level2;
import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            System.out.print("Factors of " + number + ": ");
            int i = 1;
            while (i <= number) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
        }
         
    }
}
 
