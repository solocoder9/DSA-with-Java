import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {

    // Method to perform merge sort
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the mid
            int mid = low + (high - low) / 2;

            // Recursively sort the left and right halves of the array
            mergeSort(arr, low, mid); // Left half
            mergeSort(arr, mid + 1, high); // Right half

            // Merge the sorted left and right halves
            merge(arr, low, mid, high);
        }
    }

    // Helper method to merge two sorted halves of the array
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void merge(int[] arr, int low, int mid, int high) {

        // Temporary array to hold merged elements
        int[] temp = new int[high - low + 1];

        int left = low;      // starting index of left half
        int right = mid + 1; // starting index of right half
        int k = 0;           // index for temporary array

        // Merge elements from left and right subarrays into the temporary array
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        // Copy remaining elements from the left subarray if any
        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        // Copy remaining elements from the right subarray if any
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        // Copy sorted elements from temporary array back to the original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    // Method to print elements of the array
    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Display the original array
        System.out.println("Original array: ");
        printArr(arr);

        // Sort and display the array
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        printArr(arr);

        sc.close();
    }
}
