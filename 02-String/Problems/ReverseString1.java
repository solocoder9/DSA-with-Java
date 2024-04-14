import java.util.Scanner;

public class ReverseString1 {

    // Time Complexity: O(n) where n is the length of the string
    // Space Complexity: O(n) where n is the length of the string (due to creating a new string)
    // Method to reverse a string
    static String reverseString(String str) {

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any string value: ");
        String str = sc.nextLine();

        System.out.println(reverseString(str));

        sc.close();
    }
}
