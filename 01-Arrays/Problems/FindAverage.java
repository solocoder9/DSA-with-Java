import java.util.Scanner;

public class FindAverage {
    
    // Method to find the average of the array
    static void findAverage(int[] arr, int size) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = sum / arr.length;

        System.out.println("Average of the array is: " + average);
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

        findAverage(arr, size);

        sc.close();
    }
}
