public class ArrayTraversing4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // Traversing array elements using do-while loop
        int i = 0;
        do {
            System.out.print(arr[i] + " ");
            i++;
        } while(i < arr.length);
    }
}
