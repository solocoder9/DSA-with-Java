import java.util.Scanner;

public class CheckSorted1 {
    
    // Time Complexity: O(n) where n is the number of elements in the array
    // Space Complexity: O(1)
    // Method to check if the array is sorted in non-decreasing order
    static boolean checkArray(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
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

        System.out.println(checkArray(arr));

        sc.close();
    }
}
