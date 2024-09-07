import java.util.Scanner;

public class CheckSorted {

    // Method to check if the array is sorted or not
    public static boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        if (isSorted(arr)) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorte");
        }

        sc.close();
    }
}
