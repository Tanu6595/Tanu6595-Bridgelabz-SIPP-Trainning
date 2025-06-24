package level1;
import java.util.Scanner;

public class CaseConversionComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();
        
        String builtInUpper = input.toUpperCase();
        String builtInLower = input.toLowerCase();
 
        String customUpper = convertToUpperCase(input);
        String customLower = convertToLowerCase(input);
 
        boolean upperMatch = compareStrings(builtInUpper, customUpper);
        boolean lowerMatch = compareStrings(builtInLower, customLower);

        // Displaying results
        System.out.println("\n--- Uppercase Comparison ---");
        System.out.println("Built-in toUpperCase():  " + builtInUpper);
        System.out.println("Custom toUpperCase():    " + customUpper);
        System.out.println("Do they match? " + upperMatch);

        System.out.println("\n--- Lowercase Comparison ---");
        System.out.println("Built-in toLowerCase():  " + builtInLower);
        System.out.println("Custom toLowerCase():    " + customLower);
        System.out.println("Do they match? " + lowerMatch);
    }

    // Convert lowercase letters to uppercase using ASCII
    public static String convertToUpperCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase
            }
            result.append(ch);
        }
        return result.toString();
    }
 
    public static String convertToLowerCase(String str) {
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

    // Compare two strings character by character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}
 



