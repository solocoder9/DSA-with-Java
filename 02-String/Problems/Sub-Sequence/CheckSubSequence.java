import java.util.Scanner;

public class CheckSubSequence {
    
    // Time Complexity: O(n), where n is the length of str1
    // Space Complexity: O(1)
    // Method to check if str2 is a subsequence of str1
    static boolean checkSubSequence(String str1, String str2) {
        
        int n = str1.length();
        int m = str2.length();
        
        if (m > n) {
            return false;
        }
        int j = 0;
        
        for (int i = 0; i < n && j < m; i++) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
        }

        return (j == m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the subsequence: ");
        String str2 = sc.nextLine();

        System.out.println(checkSubSequence(str1, str2));

        sc.close();
    }
}
