import java.util.Scanner;

public class LeftRotateArrayByKtimes3 {
    
    // Method to reverse the array
    static void reveserArray(int[] arr, low) {

        int lo
    }

    // Time Complexity: O(n * k)
    // Space Complexity: O(1)
    // Method to left rotate the array k times
    static int[] leftRotate(int[] arr, int k) {
        for (int i = 1; i <= k; i++) {
            rotateArr(arr);
        }
        return arr;
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
