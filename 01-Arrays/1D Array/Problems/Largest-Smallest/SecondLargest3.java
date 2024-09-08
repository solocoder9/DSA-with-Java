// Java program to find the second largest element in an array
// More Optimized approach

import java.util.Scanner;

public class SecondLargest3 {

    // Method to find the second largest element in an array
    // Time Complexity: O(n) [O(2n)]
    // Space Complexity: O(1)
    public static int findSecondLargest(int[] arr) {

        // finding largest
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // finding second largest
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
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
