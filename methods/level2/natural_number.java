 package level2;
import java.util.*;

public class natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        System.out.println("Sum using formula: " + formula(n));
        System.out.println("Sum using recursion: " + recr(n));
 
    }
 
    public static int formula(int n) {
        return n * (n + 1) / 2;
    }
 
    public static int recr(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + recr(n - 1); 
        }
    }
}