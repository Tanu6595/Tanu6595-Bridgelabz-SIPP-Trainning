package level2;
import java.util.Scanner;

public class StringLengthFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a string: ");
        String input = sc.next();
        sc.close();
 
        int customLength = getStringLength(input);
        int builtInLength = input.length();
 
        System.out.println("Custom calculated length: " + customLength);
        System.out.println("Built-in length():        " + builtInLength);
    }
 
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);   
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
             
        }
        return count;
    }
}

