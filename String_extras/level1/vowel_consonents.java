package level1;
import java.util.Scanner;

public class  vowel_consonents  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;
        String vowelsList = "aeiou";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowelsList.indexOf(ch) != -1) {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
         }

        System.out.println("Number of vowels = " + vowels);
        System.out.println("Number of consonants = " + consonants);
        sc.close();
    }
}
 
