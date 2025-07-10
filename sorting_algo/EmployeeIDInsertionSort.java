package sorting_algo;
import java.util.Scanner;

public class EmployeeIDInsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] empIds = new int[n];
 
        System.out.println("Enter the employee IDs:");
        for (int i = 0; i < n; i++) {
            System.out.print("Employee ID " + (i + 1) + ": ");
            empIds[i] = sc.nextInt();
        }
  
        insertionSort(empIds);
 
        System.out.println("Sorted Employee IDs in ascending order:");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    } 
    static void insertionSort(int[] arr) {
        int n = arr.length;
 
        for (int i = 1; i < n; i++) {
            int key = arr[i]; 
            int j = i - 1;
 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
 
            arr[j + 1] = key;
        }
    }
}
 
