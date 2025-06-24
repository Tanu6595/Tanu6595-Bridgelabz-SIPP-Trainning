package level2;
import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Amar's age and height: ");
        int ageAmar = scanner.nextInt();
        int heightAmar = scanner.nextInt();
        
        System.out.print("Enter Akbar's age and height: ");
        int ageAkbar = scanner.nextInt();
        int heightAkbar = scanner.nextInt();
        
        System.out.print("Enter Anthony's age and height: ");
        int ageAnthony = scanner.nextInt();
        int heightAnthony = scanner.nextInt();
        
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        
        System.out.println("The youngest friend's age is: " + youngestAge);
        System.out.println("The tallest friend's height is: " + tallestHeight);
 
    }
}
 
