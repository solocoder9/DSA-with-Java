import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input elements
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements arr: ");

        // Print array elements
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }   
}
