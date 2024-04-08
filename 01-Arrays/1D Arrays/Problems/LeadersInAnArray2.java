import java.util.Scanner;

public class LeadersInAnArray2 {
    
    // Method to print leaders in an array
    static void printLeaders(int[] arr) {

        int curr_ldr = arr[arr.length - 1];
        System.out.print(curr_ldr + " ");

        for (int i = arr.length - 1; i >= 0; i--) {
            if(curr_ldr < arr[i]) {
                curr_ldr = arr[i];
                System.out.print(curr_ldr + " ");
            }
        }
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

        printLeaders(arr);
        
        sc.close();
    }
}
