import java.util.Scanner;

public class ReverseString4 {

    // Time Complexity: O(n), where n is the length of the input string
    // Space Complexity: O(n), for the char array conversion and the StringBuilder object
    // Method to reverse a string
    static String reverseString(String str) {

        // convert the string to char array
        char[] charArr = str.toCharArray();
        int low = 0;
        int high = charArr.length - 1;

        // swap characters using two pointers
        while (low < high) {
            char temp = charArr[low];
            charArr[low] = charArr[high];
            charArr[high] = temp;
            low++;
            high--;
        }

        // convert char array back to string
        return new String(charArr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string value: ");
        String str = sc.nextLine();

        System.out.println(reverseString(str));

        sc.close();
    }
}
