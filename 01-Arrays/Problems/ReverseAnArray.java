import java.util.Scanner;

class ReverseAnArray {
    
    // Method to reverse the array
    static void reverse(int[] arr, int size) {
        
        int low = 0;
        int high = arr.length - 1;

        for(int i = 0; i < arr.length; i++) {
            while(low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }

        // Print the reversed array elements
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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

        reverse(arr, size);

        sc.close();
    }
}
