import java.util.Scanner;

public class SecondLargest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array elements 
        int temp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        int largest = arr[arr.length - 1];
        int secLargest = 0;


        for(int i = arr.length-1; i > 0; i--) {
            if(arr[i] != largest) {
                secLargest = arr[i];
                break;
            }
        }

        System.out.println("Second largest element of the array is: " + secLargest); 

        sc.close();
    }    
}
