import java.util.Scanner;

public class CountVowels {

    // Time Complexity: O(n) where n is the number of characters in the string
    // Space Complexity: O(1)
    // Method to count vowels in a string
    static int countVowels(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any string value: ");
        String str = sc.nextLine();

        System.out.println("Vowels count is: " + countVowels(str));

        sc.close();
    }
}
