public class SearchAnelement {
    public static void main(String[] args) {
        int[] arr = {10, 7, 9, 15, 35};

        int element = 9;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                System.out.print(element +" is found at the index number " + i);
            }
        }
    }
}
