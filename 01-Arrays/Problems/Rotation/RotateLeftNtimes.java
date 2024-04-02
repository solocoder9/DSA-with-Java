import java.util.Scanner;

public class RotateLeftNtimes {
    
    // Method to rotate left n times 
    static int[] rotateLeftNtimes(int[] arr, int n) {

        n = n % arr.length; // to handel cases where n is greater than array length

        for (int i = 0; i < n; i++) {
            int temp = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }
            arr[arr.length - 1] = temp;
        }

        return arr;
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

        System.out.print("Enter the number of rotation: ");
        int n = sc.nextInt();

        // Rotate the array
        rotateLeftNtimes(arr, n);

        // print the array element 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
