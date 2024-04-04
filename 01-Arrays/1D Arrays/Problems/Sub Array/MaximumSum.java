import java.util.Scanner;

public class MaximumSum {
   
    // Method to calculate maximum sum of a array
    static int maximumSum(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int i= 0; i < arr.length; i++) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maximumSum(arr));

        sc.close();
    }
}
