import java.util.Scanner;

public class CountCharacters {

    // Time Complexity: O(n) where n is the number of characters in the string
    // Space Complexity: O(1)
    // Method to count characters in a string
    static int countCharacters(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any string value: ");
        String str = sc.nextLine();

        System.out.println("Characters count is: " + countCharacters(str));

        sc.close();
    }
}
