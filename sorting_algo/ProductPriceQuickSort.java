package sorting_algo;
import java.util.Scanner;
public class ProductPriceQuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter number of products: ");
        int n = sc.nextInt();
   double[] prices = new double[n]; 
        System.out.println("Enter the prices of " + n + " products:");
        for (int i = 0; i < n; i++) {
            System.out.print("Price " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }
    quickSort(prices, 0, n - 1);
   System.out.println("Sorted product prices in ascending order:");
        for (double price : prices) {
            System.out.print(price + " ");
        }
    }
   static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
             int pi = partition(arr, low, high);
   quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
   static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];  
        int i = low - 1;  
        for (int j = low; j < high; j++) {
          if (arr[j] <= pivot) {
                i++;
               double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
 
