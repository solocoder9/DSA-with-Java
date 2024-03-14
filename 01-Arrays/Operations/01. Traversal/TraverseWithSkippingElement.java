public class TraverseWithSkippingElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 29, 50, 60};

        // Skipping element is 20 and 29

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 20 || arr[i] == 29) {
                continue; // Skip elemes with value 20 and 29
            }

            System.out.print(arr[i] + " ");
        }
    }   
}