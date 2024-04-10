import java.util.Scanner;

public class PrintReverseString {
    
    // Method to print reverse String
    static void printReverse(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any String value: ");
        String str = sc.nextLine();

        printReverse(str);

        sc.close();
    }
}
