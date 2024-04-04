public class TwoDarrayDeclaration {
    public static void main(String[] args) {

        // 2D arary declaration
        int[][] arr = new int[2][];
        arr[0] = new int[2];
        arr[1] = new int[3];

        // Assigning values to the 2D array(Initialization)
        arr[0][0] = 1;
        arr[0][1] = 2;

        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[1][2] = 5;

        // Printint the array elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}