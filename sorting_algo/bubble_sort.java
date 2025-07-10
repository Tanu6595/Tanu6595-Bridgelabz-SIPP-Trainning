package sorting_algo;
import java.util.Scanner;
public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
 
        System.out.println("Enter the marks of " + n + " students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
 
        bubbleSort(marks);
 
        System.out.println("Sorted marks in ascending order:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
 
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
 
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                     int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            if (!swapped) break;
        }
    }
}
 