package level1;
import java.util.*;
public class multiplication_table {
	public static void main(String[]args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=10;i++) {
	int mul=n*i;
System.out.println(mul);	
}
}
}