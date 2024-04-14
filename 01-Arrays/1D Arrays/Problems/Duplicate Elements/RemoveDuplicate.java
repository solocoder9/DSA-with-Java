import java.util.Scanner;

public class RemoveDuplicate {
    
    // Time Complexity: O(n^2) (due to sorting)
    // Space Complexity: O(1)
    static int removeDuplicate(int[] arr) {

        // sorting an array 
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int res = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[res - 1] != arr[i]) {
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < removeDuplicate(arr); i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
