public class TwoDarrayDeclaration2 {
    public static void main(String[] ags) {

        // 2D array declaration and initialization in a single line
        int[][] arr = {{10, 20}, {30, 40, 50}};

        // print length of the array
        System.out.println(arr[0].length); //2

        // Print array elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
