import java.util.Scanner;

public class LargestElement {

    // Method to find the largest element in the array
    public static int findLargest(int[] arr) {
        int largest = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
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

        // Calling method to find the largest element 
        System.out.println("Largest element of the array is " + findLargest(arr));

        sc.close();
    }
}
