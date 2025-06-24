 package level1;

public class discount_universityFee {
    public static void main(String[] args) {
        int fee = 125000;
        int discount = 10;
        
        // Correct calculation using double for precision
        double discountedFee = fee * (discount / 100.0);
        
        System.out.println("Discounted Fee: " + discountedFee);
    }
    
}
