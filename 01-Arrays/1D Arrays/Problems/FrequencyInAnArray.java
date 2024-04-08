import java.util.Scanner;

public class FrequencyInAnArray {
    
    // Method to print frequencies of array elments
    static void printFrequencies(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            boolean isPrntd = false;
            for (int k = i - 1; k >= 0; k--) {
                if(arr[i] == arr[k]) {
                    isPrntd = true;
                    break;
                }
            }
            if (!isPrntd) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
            }
            if (!isPrntd) {
                System.out.println(arr[i] + " --> " + count);
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

        printFrequencies(arr);
        
        sc.close();
    }
}
