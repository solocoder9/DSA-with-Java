// Selection Sort
// Efficient approach
// Bidirectional Selection Sort(Cocktail Sort)

import java.util.Scanner;

public class SelectionSort4 {

    // Method to sort an array using Selection Sort
    // Time Complexity: O(n^2)
    // Scace Complexity: O(1)
    public static void selectionSort(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int minIndex = left;
            int maxIndex = right;

            for (int i = left; i <= right; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }

            // Swap the minimum element with the left element
            if (minIndex != left) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[left];
                arr[left] = temp;
            }

            // Update maxIndex if it was the left element that was swapped
            if (maxIndex == left) {
                maxIndex = minIndex;
            }

            // Swap the maximum element with the right element
            if (maxIndex != right) {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[right];
                arr[right] = temp;
            }

            // Move the boundaries inward
            left++;
            right--;
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input elements
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        selectionSort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
