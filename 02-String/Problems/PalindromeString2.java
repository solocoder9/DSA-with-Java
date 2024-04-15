import java.util.Scanner;

public class PalindromeString2 {

    // Time Complexity: O(n) where n is the length of the string
    // Space Complexity: O(1) 
    // Method to check if the string is palindrome or not
    static boolean checkPalindrome(String str) {

        int begin = 0;
        int end = str.length() - 1;

        while (begin < end) {
            if (str.charAt(begin) != str.charAt(end)) {
                return false;
            }
            begin++;
            end--;
        }

        return true;
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
