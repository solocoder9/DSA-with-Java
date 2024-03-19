import java.util.Scanner;

public class SelectionSort3 {
    
    // Method to sort an array using Selection Sort
    // Time Complexity: O(n^2)
    // Scace Complexity: O(1)
    static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            /*
             * Swap if the minimum element('arr[minIndex]') is found
             * to be different from current element at index - 'i'
             * - This optimization reduces the nmber of uncessary swaps,
             * making the algorithms more efficient.
             */
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        selectionSort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
