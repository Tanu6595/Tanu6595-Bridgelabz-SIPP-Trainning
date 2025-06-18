package level1; 
 
import java.util.*;

public class Sum_of_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " natural numbers: " + fun(n));
    }

    public static int fun(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}