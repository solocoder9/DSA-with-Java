import java.util.Scanner;

public class SumOfArray {

    // Time Complexity: O(n) where n is the number of elements in the array
    // Space Complexity: O(1)
    // Method to calculate the sum of the array
    static int calSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
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

        System.out.println("Sum of the array elements: " + calSum(arr));

        sc.close();
    }
}
