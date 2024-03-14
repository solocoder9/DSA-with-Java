public class DeleteAnElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int delElement = 30;

        for(int i = 0; i < arr.length; i++) {

            if(delElement == arr[i]) {
                    
                for(int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }

        // Print the array elements from 0 to arr.length - 1
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
