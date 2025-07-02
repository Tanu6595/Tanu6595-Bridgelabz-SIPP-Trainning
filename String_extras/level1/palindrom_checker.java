package level1;
import java.util.Scanner;

public class palindrom_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        sc.close();

        if (isPalindrome(s)) {
            System.out.printf("\"%s\" is a palindrome.%n", s);
        } else {
            System.out.printf("\"%s\" is not a palindrome.%n", s);
        }
    }

    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
