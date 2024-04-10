import java.util.Scanner;

public class PalindromeString {
    
    // Method to check if the string is palindrome or not
    static boolean checkPalindrome(String str) {

        // reverse the string
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return str.equals(rev);
    }

    public static void main(String[] arsg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any string value: ");
        String str = sc.nextLine();

        if(checkPalindrome(str)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }

        sc.close();
    }
}
