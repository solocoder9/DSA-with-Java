import java.util.Scanner;

public class CheckSorted {
    
    // Method to check the array is sorted or not (Ascending)
    static void checkArray(int[] arr) {
        
        int temp = arr[0];
        int count = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < temp) {
                count++;
                break;
            }
        }
        if(count != 0) {
            System.out.println("Array is not sorted");
        }
        else {
            System.out.println("Array is sorted");
        }
        
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

        checkArray(arr);

        sc.close();
    }
}
