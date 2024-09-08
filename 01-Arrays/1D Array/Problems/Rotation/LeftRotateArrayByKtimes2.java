import java.util.Scanner;

public class LeftRotateArrayByKtimes2 {

    // Time Complexity: O(n)
    // Space Complexity: O(k)
    // Method to left rotate array k times
    public static void leftRotate(int[] arr, int k) {

        int[] temp = new int[k]; // O(k) space

        for (int i = 0; i < k; i++) { // O(k) time
            temp[i] = arr[i];
        }

        for (int i = k; i < arr.length; i++) { // O(n - k) time
            arr[i - k] = arr[i];
        }

        for (int i = 0; i < k; i++) { // O(k) time
            arr[arr.length - k + i] = temp[i];
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Method to print array elements
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Rotate the array
        System.out.print("Enter how many times you want to rotate left: ");
        int k = sc.nextInt();

        leftRotate(arr, k);

        // Output
        printArr(arr);

        sc.close();
    }

}
