import java.util.Scanner;

public class CountCharacters2 {
    
    // Method to count characters in a string 
    static int countCharacters(String str) {

        int count = 0;
        // count characters except space
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                count++;
            }
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
