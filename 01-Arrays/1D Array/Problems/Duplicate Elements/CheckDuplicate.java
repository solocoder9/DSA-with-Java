import java.util.Scanner;

public class CheckDuplicate {

    // Time Complexity: O(n^2), where n is the length of the array
    // Space Complexity: O(1)
    // Method to print the duplicate element of the array
    public static void checkDuplicate(int[] arr) {
        boolean hasDuplicate = false;
        int printed = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    if (arr[i] != printed) {
                        System.out.print(arr[i] + " ");
                        printed = arr[i];
                    }
                    break;
                }
            }
        }

        // if(hasDuplicate == false)
        if (!hasDuplicate) {
            System.out.println("No duplicate found");
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        checkDuplicate(arr);

        sc.close();
    }
}
