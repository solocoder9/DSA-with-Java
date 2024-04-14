import java.util.Scanner;

public class MaximumDifference {

    // Time Complexity: O(n^2) where n is the number of elements in the array
    // Space Complexity: O(1)
    // Method to print the maximum difference
    static void printMaxDiff(int[] arr) {

        int maxDiff = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] - arr[i]) > maxDiff) {
                    maxDiff = arr[j] - arr[i];
                }
            }
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
