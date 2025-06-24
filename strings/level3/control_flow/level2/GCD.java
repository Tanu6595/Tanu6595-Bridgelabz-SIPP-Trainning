package level2;
import java.util.Scanner;

public class GCD {
    public static int computeGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + computeGCD(num1, num2));

        scanner.close();
    }
}
 