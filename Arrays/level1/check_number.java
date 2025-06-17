 package level1;
import java.util.*;

public class check_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println("number is positive and even");
                } else {
                    System.out.println("number is positive and odd");
                }
            } else if (arr[i] < 0) {
                System.out.println("number is negative");
            } else {
                System.out.println("number is zero");
            }
        }

        if (arr[0] > arr[arr.length - 1]) {
            System.out.println("first is greater");
        } else if (arr[0] < arr[arr.length - 1]) {
            System.out.println("last is greater");
        } else {
            System.out.println("both are equal");
        }
    }
}