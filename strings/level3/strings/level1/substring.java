package level1;
import java.util.*;
public class substring {
	 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        int start = sc.nextInt();
	        int end = sc.nextInt();
	        sc.close();

	        // Built-in substring method
	        String res = str.substring(start, end);
	        System.out.println("Built-in substring: " + res);

	        // Custom substring using charAt()
	        String custom = fun(str, start, end);
	        System.out.println("Custom substring using charAt(): " + custom);
	    }

	    public static String fun(String str, int start, int end) {
	        StringBuilder substring = new StringBuilder();
	        for (int i = start; i < end; i++) {
	            substring.append(str.charAt(i));
	        }
	        return substring.toString();
	    
	}
}
