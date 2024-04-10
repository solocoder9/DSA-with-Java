public class Test2 {
    public static void main(String[] args) {
        // Create a string with "Hello, World!"
        String greeting = "Hello, World!";

        // Split the string into an array of words using split()
        String[] words = greeting.split(", ");

        // Print the first word
        System.out.println("First Word: " + words[0]);

        // Print the second word
        System.out.println("Second Word: " + words[1]);
    }
}
