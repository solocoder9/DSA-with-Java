import java.util.Scanner;

public class SwapTwoNumber {
    
    // Method to swap two numbers using third variable
    static void swapNumber(int a , int b) {

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        swapNumber(a, b);

        sc.close();
    }
}
