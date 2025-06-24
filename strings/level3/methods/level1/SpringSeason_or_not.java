 package level1;
import java.util.*;

public class SpringSeason_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month and date:");
        
        String month = sc.next(); // Using next() instead of nextLine() to avoid input issues
        int date = sc.nextInt();
        
        checkSpringSeason(date, month);
    }

    public static void checkSpringSeason(int date, String month) {
        if (date <= 20 && (month.equals("March") || month.equals("April") || month.equals("May") || month.equals("June"))) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}