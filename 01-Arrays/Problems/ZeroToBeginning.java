import java.util.Scanner;

class ZeroToBeginning {
    
    // Method to move zeros at beginning
    static int[] moveZeros(int[] arr) {
        
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        return arr;
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

        moveZeros(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
