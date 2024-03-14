public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {15, 10, 9, 22, 18, 9, 3, 17};
        int temp;

        // Sorting the array elements in ascending order
        for(int i = 0; i < arr.length; i++) {

            for(int j = i+1; j < arr.length; j++) {

                if(arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
