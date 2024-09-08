// Insert Array element using shifting element;

public class InsertAnElement3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int pos = 3; // 3rd position / pos - 1 = 2 index
        int element = 999;

        // Reverse traversing
        for(int i = arr.length - 1; i > pos - 1; i--) {
            arr[i] = arr[i-1];
        }

        arr[pos - 1] = element;

        // Print array elements after insert the new element 
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
