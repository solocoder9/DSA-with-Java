import java.util.Scanner;

public class InsertionSort {
    
    // Method to sorting an array uing Insertion sort
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currentElement) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Place to right position
            arr[j + 1] = currentElement;
        }

        return arr;
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

        insertionSort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
