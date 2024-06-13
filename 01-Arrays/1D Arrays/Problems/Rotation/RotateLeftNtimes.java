import java.util.Scanner;

public class RotateLeftNtimes {

    // Time Complexity: O(n * d) where n is the number of elements in the array and
    // d is the number of rotations
    // Space Complexity: O(1)
    // Method to rotate left n times
    public static int[] rotateLeftNtimes(int[] arr, int n) {

        n = n % arr.length; // to handle cases where n is greater than array length

        for (int i = 0; i < n; i++) {
            int temp = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }
            arr[arr.length - 1] = temp;
        }

        return arr;
    }

    // Driver code
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

        System.out.print("Enter the number of rotations: ");
        int n = sc.nextInt();

        // Rotate the array
        int[] rotatedArray = rotateLeftNtimes(arr, n);

        // Print the rotated array
        System.out.println("Rotated array:");
        for (int i = 0; i < rotatedArray.length; i++) {
            System.out.print(rotatedArray[i] + " ");
        }

        sc.close();
    }
}
