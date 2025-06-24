package level1;
import java.util.*;
public class athlete_run {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println(fun(a,b,c));
}
	public static int fun(int a,int b,int c) {
		int n=a+b+c;
		int run=n/5;
		return run;
	}
		
	}


