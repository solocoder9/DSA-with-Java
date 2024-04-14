import java.util.Scanner;

public class PalindromeString {

    // Time Complexity: O(n) where n is the length of the string
    // Space Complexity: O(n) for the reversed string 'rev'
    // Method to check if the string is palindrome or not
    static boolean checkPalindrome(String str) {

        // reverse the string
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return str.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any string value: ");
        String str = sc.nextLine();

        if (checkPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        sc.close();
    }
}
