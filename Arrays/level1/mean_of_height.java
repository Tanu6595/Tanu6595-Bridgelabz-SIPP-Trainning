package level1;
import java.util.*;
public class mean_of_height {
public static void main(String[]args) {
	int arr[]=new int[11];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		
	}
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=arr[i]+sum;
	
	}
int mean=sum/11;
System.out.println("mean::"+mean);
}
}
