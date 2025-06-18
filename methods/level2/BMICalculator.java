package level2;
 
import java.util.Scanner;

public class BMICalculator {
 
    public static void calculateBMI(double[][] bmiData) {
        for (int i = 0; i < bmiData.length; i++) {
            double weight = bmiData[i][0];
            double heightInMeters = bmiData[i][1] / 100.0; // Convert cm to meters
            bmiData[i][2] = weight / (heightInMeters * heightInMeters); // BMI formula
        }
    }
 
    public static String[] getBMIStatus(double[][] bmiData) {
        String[] status = new String[bmiData.length];
        for (int i = 0; i < bmiData.length; i++) {
            double bmi = bmiData[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] bmiData = new double[10][3];  
 
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            bmiData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            bmiData[i][1] = sc.nextDouble();
        }
 
        calculateBMI(bmiData);
        String[] bmiStatus = getBMIStatus(bmiData);
 
        System.out.println("\nHeight, Weight, BMI, and Status of each individual:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d -> Weight: %.2f kg | Height: %.2f cm | BMI: %.2f | Status: %s%n",
                    i + 1, bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiStatus[i]);
        }

        sc.close();  
    }
}
 
