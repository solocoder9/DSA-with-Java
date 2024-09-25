// Bubble Sort
// Optimized approach

import java.util.Scanner;

public class BubbleSort2 {

    // Method to sort an array using Bubble sort
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input elements
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        bubbleSort(arr);

        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
