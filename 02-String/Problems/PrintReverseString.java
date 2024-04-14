import java.util.Scanner;

public class PrintReverseString {

    // Time Complexity: O(n) where n is the length of the string
    // Space Complexity: O(1) as we are not using any additional space
    // Method to print reverse String
    static void printReverse(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any String value: ");
        String str = sc.nextLine();

        printReverse(str);

        sc.close();
    }
}
