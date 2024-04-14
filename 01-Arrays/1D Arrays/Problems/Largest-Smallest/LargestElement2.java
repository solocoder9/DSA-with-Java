import java.util.Scanner;
import java.util.Arrays;

public class LargestElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array in ascending order
        // Time Complexity: O(n log n) (where n is the size of the array)
        // Space Complexity: O(1) (no additional space is used)
        Arrays.sort(arr);

        // The largest element will be at the end of the sorted array
        System.out.println("Largest element of the array is: " + arr[arr.length-1]);

        sc.close();
    }
}
