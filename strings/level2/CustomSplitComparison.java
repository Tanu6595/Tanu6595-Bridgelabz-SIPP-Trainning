package level2;
import java.util.Scanner;

public class   CustomSplitComparison{
  public static int getLength(String str) {
        int i = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch (Exception e) {
            
        }
        return i;
    } 
    public static String[] customSplit(String str) {
        int len = getLength(str);
        String[] temp = new String[100];   
        String word = "";
        int count = 0;

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                word += c;
            } else if (!word.equals("")) {
                temp[count++] = word;
                word = "";
            }
        }
        if (!word.equals("")) temp[count++] = word;
 
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    } 
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] custom = customSplit(input);
        String[] builtin = input.split(" ");

        System.out.println("\nCustom split:");
        for (String word : custom) System.out.println(word);

        System.out.println("\nBuilt-in split:");
        for (String word : builtin) System.out.println(word);

        System.out.println("\nDo both match? " + compareArrays(custom, builtin));
    }
}

 