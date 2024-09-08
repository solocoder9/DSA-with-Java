// Java program to find the second largest element in an array
// Optimized approach

import java.util.Scanner;
import java.util.Arrays;

public class SecondLargest2 {

    // Method to find the second largest element in an array
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public static int findSecondLargest(int[] arr) {

        // Sorting the array using Arrays.sort()
        Arrays.sort(arr);

        int largest = arr[arr.length - 1];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }

        return secondLargest;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding and printing the second largest element
        System.out.println("Second largest element in the array is: " + findSecondLargest(arr));
        sc.close();
    }
}
