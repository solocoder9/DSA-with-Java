import java.util.Scanner;

public class SwapTwoNumber3 {
    
    // Method to swap two numbers using XOR operator
    static void swapNumber(int a , int b) {

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

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
