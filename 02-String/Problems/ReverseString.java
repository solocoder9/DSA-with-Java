import java.util.Scanner;

public class ReverseString {
    
    // Time Complexity: O(n), where n is the length of the input string
    // Space Complexity: O(n), for the StringBuilder object
    // Method to check if the string is palindrome or not
    static boolean checkPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string value: ");
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
