import java.util.Scanner;

public class Largest3element {
    
    // Method to find largest 3 element from an array
    static void printLargest(int[] arr, int size) {

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }
            else if (arr[i] > thirdLargest && arr[i] != firstLargest && arr[i] != secondLargest) {
                thirdLargest = arr[i];
            }
        }

        
        System.out.println(firstLargest);
        System.out.println(secondLargest);
        System.out.println(thirdLargest);
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

        printLargest(arr, size);

        sc.close();
    }
}
