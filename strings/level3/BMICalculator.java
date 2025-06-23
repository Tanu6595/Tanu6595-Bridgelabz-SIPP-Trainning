package level3;
import java.util.Scanner;
 public class BMICalculator {
   public static String[][] calculateBMIAndStatus(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;   

            double bmi = weight / (heightM * heightM);
            String status;

            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
 
            result[i][0] = String.format("%.2f", heightCm);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to display BMI info
    public static void displayBMIInfo(String[][] bmiData) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n",
                    bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][2];  

        System.out.println("Enter the weight (kg) and height (cm) of 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            personData[i][1] = sc.nextDouble();
        }

        String[][] bmiResults = calculateBMIAndStatus(personData);
        displayBMIInfo(bmiResults);
 
    }
}

 