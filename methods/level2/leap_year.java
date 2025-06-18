package level2;
import java.util.*;
public class leap_year {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
 int year=sc.nextInt();
 fun(year);
}
public static void fun(int year) {
	if((year%4==0 && year%100!=0)|| year%400==0) {
		System.out.println("year is leap year");
	}
	else {
		System.out.println("year is not a leap year");
	}
}
}
