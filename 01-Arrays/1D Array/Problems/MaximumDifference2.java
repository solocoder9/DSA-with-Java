import java.util.Scanner;

public class MaximumDifference2 {

    // Time Complexity: O(n) where n is the number of elements in the array
    // Space Complexity: O(1)
    // Method to print the maximum difference
    static void printMaxDiff(int[] arr) {

        int maxDiff = arr[1] - arr[0];
        int minVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - minVal);
            minVal = Math.min(minVal, arr[i]);
        }
        
        System.out.println(maxDiff);
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

        printMaxDiff(arr);

        sc.close();
    }
}
