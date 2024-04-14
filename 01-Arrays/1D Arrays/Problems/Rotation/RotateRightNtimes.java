import java.util.Scanner;

public class RotateRightNtimes {
    
    // Time Complexity: O(n * d) where n is the number of elements in the array and d is the number of rotations
    // Space Complexity: O(1)
    // Method to rotate right n times 
    static int[] rotateRightNtimes(int[] arr, int n) {

        n = n % arr.length; // to handle cases where n is greater than array length

        for (int i = 0; i < n; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = temp;
        }

        return arr;
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

        System.out.print("Enter the number of rotations: ");
        int n = sc.nextInt();

        // Rotate the array
        int[] rotatedArray = rotateRightNtimes(arr, n);

        // Print the rotated array
        System.out.println("Array after rotating " + n + " times to the right:");
        for (int i = 0; i < rotatedArray.length; i++) {
            System.out.print(rotatedArray[i] + " ");
        }

        sc.close();
    }
}
