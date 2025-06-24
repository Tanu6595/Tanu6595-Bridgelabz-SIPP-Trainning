package level1;
import java.util.*;
public class simple_interest {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int p=sc.nextInt();
	int r=sc.nextInt();
	int t=sc.nextInt();
	System.out.println(SI(p,r,t));
}
	public  static int SI(int p,int r,int t) {
		return (p*r*t)/100;
		
	}
}

