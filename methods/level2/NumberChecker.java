package level2;
 
import java.util.Scanner;

public class NumberChecker {
 
    public static boolean isPositive(int num) {
        return num >= 0;
    }
 
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5]; // Array to store numbers
 
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
 
        System.out.println("\nNumber Classification:");
        for (int num : numbers) {
            if (isPositive(num)) {
                if (isEven(num)) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else {
                System.out.println(num + " is negative.");
            }
        }
 
        System.out.println("\nComparison of First and Last Elements:");
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("First number is greater than last number.");
        } else if (result == 0) {
            System.out.println("First and last numbers are equal.");
        } else {
            System.out.println("First number is less than last number.");
        }

     }
}
 
