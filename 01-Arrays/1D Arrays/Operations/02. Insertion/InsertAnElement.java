// Insert array element by creating new Array

public class InsertAnElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int position = 3;
        int element = 999;

        // Creating new array 
        int[] newArr = new int[arr.length + 1];

        // Copy elements bofore the insertion position 
        for(int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[position] = element;

        // Copy elements after the insertion position
        for(int i = position + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        // Print array elements after insert the new element 
        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }    
}
