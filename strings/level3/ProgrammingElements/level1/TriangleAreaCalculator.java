package level1;
import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter the height in cm: ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 2.54 / 2.54;

        System.out.println("The area of the triangle is " + areaCm + " square cm and " + areaInches + " square inches.");
 
    }
}
 