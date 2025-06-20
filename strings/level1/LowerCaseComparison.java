package level1;
import java.util.Scanner;

public class LowerCaseComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();
        sc.close();
 
        String builtInLower = input.toLowerCase();
 
        String customLower = convertToLower(input);
 
        System.out.println("Built-in toLowerCase(): " + builtInLower);
        System.out.println("Custom toLowerCase():  " + customLower);
 
        boolean match = compareStrings(builtInLower, customLower);
        System.out.println("Do both conversions match? " + match);
    }
 
    public static String convertToLower(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
            }
            result.append(ch);
        }

        return result.toString();
    }
 
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }

        return true;
    }
}
 
