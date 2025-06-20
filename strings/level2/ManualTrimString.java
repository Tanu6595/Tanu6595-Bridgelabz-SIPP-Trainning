package level2;
import java.util.Scanner;

public class ManualTrimString {
  public static int[] findTrimIndexes(String str) {
        int start = 0;
        int end = 0;
        int len = 0;

        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {
            
        }

         
        while (start < len && str.charAt(start) == ' ') {
            start++;
        }

        // Find end index (last non-space)
        end = len - 1;
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[] {start, end};
    }

    // b. Create substring manually using charAt()
    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // c. Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;

        try {
            while (true) {
                s1.charAt(len1);
                len1++;
            }
        } catch (Exception e) {}

        try {
            while (true) {
                s2.charAt(len2);
                len2++;
            }
        } catch (Exception e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        int start = indexes[0];
        int end = indexes[1];

        String trimmedManual = (start <= end) ? manualSubstring(input, start, end) : "";
        String trimmedBuiltIn = input.trim();

        boolean isEqual = compareStrings(trimmedManual, trimmedBuiltIn);

        System.out.println("\nManual Trim Result: \"" + trimmedManual + "\"");
        System.out.println("Built-in Trim Result: \"" + trimmedBuiltIn + "\"");
        System.out.println("Do both match? " + isEqual);
    }
}

 
