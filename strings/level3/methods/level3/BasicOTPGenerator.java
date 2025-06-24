package level3;
import java.util.Scanner;

public class BasicOTPGenerator {
     
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }
 
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;  
                }
            }
        }
        return true;  
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
 
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
 
        if (areOTPsUnique(otps)) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicated.");
        }
    }
}
 
