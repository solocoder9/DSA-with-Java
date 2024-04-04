import java.util.Scanner;
import java.util.Arrays;

public class LargestElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Predefined method to sort the array in ascending order
        Arrays.sort(arr);

        System.out.println("Largest element of the array is: " + arr[arr.length-1]);

        sc.close();
    }
}
