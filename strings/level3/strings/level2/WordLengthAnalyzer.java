package level2;
import java.util.Scanner;

public class WordLengthAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();
        sc.close();

        // b. Split using charAt()
        String[] words = customSplit(input);

        // d. Generate word-length pairs
        String[][] wordWithLengths = getWordLengths(words);

        // e. Find shortest and longest words
        int[] resultIndexes = findShortestAndLongest(wordWithLengths);

        // f. Display results
        System.out.println("\nWords and their lengths:");
        for (String[] pair : wordWithLengths) {
            System.out.println(pair[0] + " → " + pair[1]);
        }

        System.out.println("\nShortest word: " + wordWithLengths[resultIndexes[0]][0]);
        System.out.println("Longest word: " + wordWithLengths[resultIndexes[1]][0]);
    }

    // b. Custom split
    public static String[] customSplit(String str) {
        int len = getLength(str);
        int spaceCount = 0;

        // Count spaces
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') spaceCount++;
        }

        // Find space indexes
        int[] spaceIndexes = new int[spaceCount + 2];
        spaceIndexes[0] = -1;
        int pos = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[pos++] = i;
            }
        }
        spaceIndexes[pos] = len;

        // Extract words
        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                sb.append(str.charAt(j));
            }
            words[i] = sb.toString();
        }
        return words;
    }

    // c. Custom length method
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Do nothing
        }
        return count;
    }

    // d. Create word-length 2D array
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    // e. Find shortest and longest words
    public static int[] findShortestAndLongest(String[][] wordData) {
        int shortestIndex = 0, longestIndex = 0;
        int min = Integer.parseInt(wordData[0][1]);
        int max = min;

        for (int i = 1; i < wordData.length; i++) {
            int length = Integer.parseInt(wordData[i][1]);
            if (length < min) {
                min = length;
                shortestIndex = i;
            }
            if (length > max) {
                max = length;
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }
}
 
