// Java program to remove duplicates from a sorted array
// Brute force approach using new array

import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove the duplicate elements from a sorted array
    public static int[] removeDuplicates(int[] arr) {

        int[] arr2 = new int[arr.length];
        int pos = 0;
        int element = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                arr2[pos] = arr[i];
                element = arr[i];
                pos++;
            }
        }
        return arr2;
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

        int[] arr2 = removeDuplicates(arr);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        sc.close();
    }
}
