package level1;
import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String input = sc.nextLine();
        System.out.print("Character to Remove: ");
        char toRemove = sc.nextLine().charAt(0);
        sc.close();

        String result = removeChar(input, toRemove);
        System.out.println("Modified String: \"" + result + "\"");
    }

    public static String removeChar(String s, char ch) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ch) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
 
