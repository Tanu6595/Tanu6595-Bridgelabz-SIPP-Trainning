package level3;
import java.util.Scanner;
import java.util.Calendar;

public class CalendarDisplay {
    
    private static final String[] MONTH_NAMES = {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };
 
    private static final int[] DAYS_IN_MONTH = { 
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 
    };
 
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
 
    public static int getDaysInMonth(int month, int year) {
        if (month == 1 && isLeapYear(year)) { 
            return 29;
        }
        return DAYS_IN_MONTH[month];
    }

     public static int getFirstDayOfMonth(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);
        return calendar.get(Calendar.DAY_OF_WEEK); // 1 = Sunday, 2 = Monday, ...
    }
 
    public static void displayCalendar(int month, int year) {
        System.out.println("\n  " + MONTH_NAMES[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);
 
        for (int i = 1; i < firstDay; i++) {
            System.out.print("   ");
        } 
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + firstDay - 1) % 7 == 0) {
                System.out.println();  
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt() - 1;  
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
 
        displayCalendar(month, year);

        scanner.close();
    }
}
 
