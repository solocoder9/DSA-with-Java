import java.util.Scanner;

public class LargestElementIndex2 {
    
    // Time Complexity: O(n) (where n is the size of the array)
    // Space Complexity: O(1)
    static int getLargest(int[] arr, int size) {
        int res = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Index value of largest element is " + getLargest(arr, size));

        sc.close();
    }
    
}
