import java.util.Scanner;

public class FindAverage {
    
    // Time Complexity: O(n) where n is the number of elements in the array
    // Space Complexity: O(1)
    // Method to find the average of the array
    static double findAverage(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return ((double)sum / arr.length);
    }

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

        System.out.println("Average of the array is: " + findAverage(arr));

        sc.close();
    }
}
