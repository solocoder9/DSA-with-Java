import java.util.Scanner;

public class LeftRotateArrayByKtimes3 {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Method to reverse the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Method to left rotate the array k times
    public static void leftRotate(int[] arr, int k) {
        k = k % arr.length; // To handle cases where k is greater than n

        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Method to print array elements
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Rotate the array
        System.out.print("Enter how many times you want to rotate left: ");
        int k = sc.nextInt();

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        leftRotate(arr, k);

        // Output
        System.out.println("Array after left rotation:");
        printArr(arr);

        sc.close();
    }

}
