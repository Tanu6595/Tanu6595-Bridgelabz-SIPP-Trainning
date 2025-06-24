package level1;
import java.util.*;
public class positive_negative_zero_check {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(fun(n));
	
}
public static int fun(int n) {
	if(n<0) {
		return -1;
	}
	else if(n>0) {
		return 1;
	}
	else {
		return 0;
	}
}
}
