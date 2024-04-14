import java.util.Scanner;

public class FrequencyInAnArray {
    
    // Time Complexity: O(n^2) where n is the number of elements in the array
    // Space Complexity: O(1)
    // Method to print frequencies of array elements
    static void printFrequencies(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            boolean isPrinted = false;
            for (int k = i - 1; k >= 0; k--) {
                if(arr[i] == arr[k]) {
                    isPrinted = true;
                    break;
                }
            }
            if (!isPrinted) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
            }
            if (!isPrinted) {
                System.out.println(arr[i] + " --> " + count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        printFrequencies(arr);
        
        sc.close();
    }
}
