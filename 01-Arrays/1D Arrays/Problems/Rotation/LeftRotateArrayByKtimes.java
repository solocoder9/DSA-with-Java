import java.util.Scanner;

public class LeftRotateArrayByKtimes {

    // Time Complexity: O(n * k)
    // Space Complexity: O(1)
    // Method to left rotate the array k times
    public static int[] rotateArr(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    // Time Complexity: O(n * k)
    // Space Complexity: O(1)
    // Method to left rotate the array k times
    public static int[] leftRotate(int[] arr, int k) {
        for (int i = 1; i <= k; i++) {
            rotateArr(arr);
        }
        return arr;
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
