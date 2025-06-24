package level1;
import java.util.*;
public class smallest_and_largest {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	fun(a,b,c);
	
}
public static void fun(int a,int b,int c) {
	if(a>b&&a>c) {
		System.out.println("a is greater");
		
	}
	else if(b>a&&b>c) {
		System.out.println("b is greater");
		
	}
	else {
		System.out.println("c is greater");
	}
	
}
}
