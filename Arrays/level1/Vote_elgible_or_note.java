package level1;
import java.util.*;
public class Vote_elgible_or_note {
	public static void main(String[]args) {
Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++) {
	if(arr[i]>=18) {
		System.out.println(arr[i]+":Can vote");
	}
	else {
		System.out.println(arr[i]+":Can not vote");
	}
}
	}
}
