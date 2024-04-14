import java.util.Scanner;

public class SecondLargestElement2 {
    
    // Method to sorting the array elements
    // Time Complexity: O(n^2) (where n is the size of the array) due to the nested loops for bubble sort.
    // Space Complexity: O(1) as it sorts the array in-place without using any additional space.
    static void sortArr(int[] arr, int size) {

        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    // Method to find the second largest
    // Time Complexity: O(n^2) due to the sorting process in the `sortArr` method.
    // Space Complexity: O(1) as it calls the `sortArr` method, which sorts the array in-place.
    static int secondLargest(int[] arr, int size) {
        sortArr(arr, size);
        int largest = arr[0];
        int secondlar = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != largest) {
                secondlar = arr[i];
            }
        }

        return secondlar;
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

        System.out.println("Second largest element of the array is: " + secondLargest(arr, size));

        sc.close();
    }
}
