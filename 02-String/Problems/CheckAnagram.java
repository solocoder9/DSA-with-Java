import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    // Method to check if two strings are anagrams
    // Time Complexity: O(n log n) due to sorting
    // Space Complexity: O(n) for storing sorted strings
    static boolean checkAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        s1 = new String(arr1);

        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr2);
        s2 = new String(arr2);

        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();

        if (checkAnagram(s1, s2)) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }

        sc.close();
    }
}
