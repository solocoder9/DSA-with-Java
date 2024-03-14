import java.util.Scanner;

public class SumOfArray {
    
    // Method to calculate the sum of the array
    static void calSum(int[] arr, int size) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of the array is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        calSum(arr, size);

        sc.close();
    }
}
