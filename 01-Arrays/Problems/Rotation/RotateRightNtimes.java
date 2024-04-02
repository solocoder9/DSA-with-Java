import java.util.Scanner;

public class RotateRightNtimes {
    
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
        rotateRightNtimes(arr, n);

        // Print the array elements 
        System.out.println("Array after rotating " + n + " times to the right:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
