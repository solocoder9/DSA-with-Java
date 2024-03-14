import java.util.Scanner;

public class CheckSorted1 {
    
    // Method to check teh array is sorted or not 
    static boolean checkArray(int[] arr, int size) {

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of teh array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(checkArray(arr, size));

        sc.close();
    }
}
