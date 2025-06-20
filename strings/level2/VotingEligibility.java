package level2;
import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {
 
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
             ages[i] = rand.nextInt(105) - 5;
        }
        return ages;
    }

     public static String[][] checkVotingEligibility(int[] ages) {
        int n = ages.length;
        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false";
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void displayResults(String[][] data) {
        System.out.printf("%-10s%-15s\n", "Age", "Can Vote?");
        System.out.println("------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s%-15s\n", data[i][0], data[i][1]);
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] votingData = checkVotingEligibility(ages);

        System.out.println("\n--- Voting Eligibility Report ---");
        displayResults(votingData);
    }
}
 
