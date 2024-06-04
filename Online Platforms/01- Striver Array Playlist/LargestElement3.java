// Java program to find the largest element in an array
// Efficient approach

import java.util.Scanner;

public class LargestElement3 {

    // Method to find the largest element in an array
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int findLargest(int[] arr) {

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
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

        System.out.println("Largest element in the array is: " + findLargest(arr));

        sc.close();
    }
}
