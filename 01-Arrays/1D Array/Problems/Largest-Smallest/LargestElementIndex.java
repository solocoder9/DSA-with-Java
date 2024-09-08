import java.util.Scanner;

public class LargestElementIndex {
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

        // Finding the largest element 
        // Time Complexity: O(n) (where n is the size of the array)
        // Space Complexity: O(1) (no additional space is used)
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Finding the index of the largest element
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == largest) {
                System.out.println("Index position of " + largest + " is " + i);
            }
        }

        sc.close();
    }    
}
