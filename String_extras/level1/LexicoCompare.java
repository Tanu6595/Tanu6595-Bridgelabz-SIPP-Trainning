package level1;
import java.util.Scanner;

public class LexicoCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String 1: ");
        String s1 = sc.nextLine();
        System.out.print("String 2: ");
        String s2 = sc.nextLine();
        sc.close();

        int result = stringCompare(s1, s2);
        if (result < 0) {
            System.out.printf("\"%s\" comes before \"%s\"%n", s1, s2);
        } else if (result > 0) {
            System.out.printf("\"%s\" comes after \"%s\"%n", s1, s2);
        } else {
            System.out.printf("\"%s\" is equal to \"%s\"%n", s1, s2);
        }
    }

    public static int stringCompare(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        int n = Math.min(n1, n2);

        for (int i = 0; i < n; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 != c2) {
                return c1 - c2;   
            }
        }
       
        return n1 - n2;
    }
}
 
