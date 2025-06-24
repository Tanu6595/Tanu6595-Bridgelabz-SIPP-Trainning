package level1;
import java.util.*;

public class string_to_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
 
        char[] builtInArray = str.toCharArray();
        System.out.print("Using .toCharArray(): ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        System.out.println();
 
        char[] customArray = fun(str);
        System.out.print("Using custom method: ");
        for (char ch : customArray) {
            System.out.print(ch + " ");
        }
    }
 
    public static char[] fun(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }
}
