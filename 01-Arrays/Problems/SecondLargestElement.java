import java.util.Scanner;

public class SecondLargestElement {
    
    // Method to find largest element of the array
    static int findLargest(int[] arr, int size) {
        int largest = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return largest;
    }

    // Method to find the second largest element of the array
    static int findSecondLargest(int[] arr, int size) {
        int largest = findLargest(arr, size);
        int secondlargest = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[secondlargest] && arr[i] != arr[largest]) {
                secondlargest = i;
            }
        }

        return secondlargest;
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

        System.out.println("Index value of second largest element is " + findSecondLargest(arr, size));

        sc.close();
    }
}
 