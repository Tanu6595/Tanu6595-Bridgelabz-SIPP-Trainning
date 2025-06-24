 package level1;
import java.util.*;

public class multi_from6_to_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        
        System.out.println("Enter a number between 6 to 9:");
        int n = sc.nextInt();

        if (n >= 6 && n <= 9) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = n * (i + 1);
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Invalid input. Number should be between 6 and 9.");
        }
    }
}