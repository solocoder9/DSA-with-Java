import java.util.Scanner;

public class CheckSorted {
    
    // Time Complexity: O(n) where n is the number of elements in the array
    // Space Complexity: O(1)
    // Method to check if the array is sorted in ascending order
    static void checkArray(int[] arr) {
        
        boolean sorted = true;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        }

        if(sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    // Driver code
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

        checkArray(arr);

        sc.close();
    }
}
