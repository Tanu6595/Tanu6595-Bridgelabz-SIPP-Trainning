 package level1;

public class profit_or_loss_percentage {
    public static void main(String[] args) {
        int sp = 191;
        int cp = 129;
        int profit = sp - cp;
        double profit_percentage = ((double) profit / cp) * 100;
        System.out.println("Profit Percentage: " + profit_percentage + "%");
    }
}


