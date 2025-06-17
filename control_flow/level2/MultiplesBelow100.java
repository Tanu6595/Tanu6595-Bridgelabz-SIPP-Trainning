package level2;
import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 1 || number >= 100) {
            System.out.println("Invalid input Number must be positive and less than 100.");
        } else {
            System.out.print("Multiples of " + number + " below 100: ");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.print(i + " ");
                }
            }
        }
   
    }
}
 
