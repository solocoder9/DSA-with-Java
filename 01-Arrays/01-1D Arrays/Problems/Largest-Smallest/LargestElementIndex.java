import java.util.Scanner;

public class LargestElementIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding the largest element 
        int largest = Integer. MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        // find the index of the largest element
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == largest) {
                System.out.println("Index position of " + largest + " is " + i);
            }
        }

        sc.close();
    }    
}
