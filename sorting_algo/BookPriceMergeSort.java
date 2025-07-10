package sorting_algo;
import java.util.Scanner;

public class BookPriceMergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        double[] prices = new double[n];
 
        System.out.println("Enter the prices of " + n + " books:");
        for (int i = 0; i < n; i++) {
            System.out.print("Price " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        } 
        mergeSort(prices, 0, n - 1);
 
        System.out.println("Sorted book prices in ascending order:");
        for (double price : prices) {
            System.out.print(price + " ");
        }
    }
  
    static void mergeSort(double[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
 
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
 
            merge(arr, left, mid, right);
        }
    }
 
    static void merge(double[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
 
        double[] L = new double[n1];
        double[] R = new double[n2];
 
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
 
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        } 
        while (i < n1) {
            arr[k++] = L[i++];
        } 
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
 

