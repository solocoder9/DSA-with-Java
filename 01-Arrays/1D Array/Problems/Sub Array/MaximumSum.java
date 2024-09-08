import java.util.Scanner;

public class MaximumSum {

    // Time Complexity: O(n^2) where n is the number of elements in the array
    // Space Complexity: O(1)
    // Method to calculate maximum sum of a array
    public static int maximumSum(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        return maxSum;
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

        System.out.println("Maximum sum of the array is: " + maximumSum(arr));

        sc.close();
    }
}
