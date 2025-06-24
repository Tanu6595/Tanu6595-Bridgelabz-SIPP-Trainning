package level2;
import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("The number " + number + " is not a natural number.");
        } else {
            for (int i = 1; i <= number; i++) {
                System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd") + ".");
            }
        }
 
    }
}
 
