package level1;
import java.util.*;
public class campareString {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	String str1=sc.next();
	String str2=sc.next();
	int count=0;
	boolean result=str1.equals(str2);
	System.out.println("using.equals: "+result);
if(str1.length()!=str2.length()) {
	System.out.println("using.charAt(): false");
}
else {
	for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i)==str2.charAt(i)) {
			count++;
		}}
		 if(count==str1.length()) {
			 System.out.println("using.charAt(): true");
		 }
		 else {
			 System.out.println("using.charAt(): false");
		 
	}}
}
}
