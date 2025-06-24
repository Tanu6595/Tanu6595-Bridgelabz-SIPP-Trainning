package level2;
import java.util.Scanner;

public class WordLengthTable {

    // Method to get length of a string without using length()
    public static int getLength(String str) {
        int i = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch (Exception e) {
            // end of string
        }
        return i;
    }

    // Method to split string into words without using split()
    public static String[] splitWords(String text) {
        int len = getLength(text);
        String[] temp = new String[100]; // assuming max 100 words
        String word = "";
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.equals("")) {
                temp[count++] = word;
                word = "";
            }
        }
        if (!word.equals("")) {
            temp[count++] = word;
        }

        // Trim to exact length
        String[] words = new String[count];
        for (int i = 0; i < count; i++) {
            words[i] = temp[i];
        }

        return words;
    }

    // Method to create 2D array with word and its length as string
    public static String[][] getWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordLengthTable = getWordLengthTable(words);

        System.out.println("\nWord\tLength");
        System.out.println("--------------");
        for (int i = 0; i < wordLengthTable.length; i++) {
            String word = wordLengthTable[i][0];
            int length = Integer.parseInt(wordLengthTable[i][1]);
            System.out.println(word + "\t" + length);
        }
    }
}
 
