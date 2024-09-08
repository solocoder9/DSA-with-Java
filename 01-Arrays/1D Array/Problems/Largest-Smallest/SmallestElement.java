import java.util.Scanner;

public class SmallestElement {

    // Time Complexity: O(n) (where n is the size of the array)
    // Space Complexity: O(1)
    // Method to find the smallest element in the array
    public static int findSmallest(int[] arr) {

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Calling method to find the smallest element
        System.out.println("Smallest element of the array is " + findSmallest(arr));

        sc.close();
    }
}
