import java.util.Scanner;

public class BubbleSort2 {
    
    // Method to sort an array using optimized Bubble Sort
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    static int[] bubbleSort(int[] arr) {

        boolean swapped;
        
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {                
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // If no swapped in the inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
