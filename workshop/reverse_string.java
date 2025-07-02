package review1;
import java.util.*;
public class reverse_string {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
//   String rev = new StringBuilder(str).reverse().toString();
//	   System.out.println(rev);
	   char[] chars = str.toCharArray();
       int start = 0;

       for (int i = 0; i <= chars.length; i++) {
           if (i == chars.length) {
               reverse(chars, start, i - 1); 
               start = i + 1;
           }
       }
       System.out.println(new String(chars));}
       private static void reverse(char[] arr, int start, int end) {
           while (start< end) {
               char temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               start++;
               end--;
           }

		    }
		}






