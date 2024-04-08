import java.util.Scanner;

public class LeadersInAnArray {
    
    // Method to print leaders in an array
    static void printLeaders(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    isLeader = true;
                    break;
                }
            }
            if(!isLeader) {
                System.out.print(arr[i] + " ");
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
