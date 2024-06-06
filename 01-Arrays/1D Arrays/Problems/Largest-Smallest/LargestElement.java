// Java program to find the largest element in an array
// Brute force approach

import java.util.Scanner;

public class LargestElement {

    // Method to find the largest element in an array
    // Time Complexity: O(n2)
    // Space Complexity: O(n)
    public static int findLargest(int[] arr) {

        // Sorting the array using selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr[arr.length - 1];
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // For inputs
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Largest element in the array is: " + findLargest(arr));

        sc.close();
    }
}
