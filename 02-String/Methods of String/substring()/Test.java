public class Test {
    public static void main(String[] args) {

        // Create a string
        String s = "Hello, World!";

        // Get a substring starting from index 7
        String substring1 = s.substring(7);

        // Get a substring from index 7 to 12 (excluding 12)
        String substring2 = s.substring(7, 12);

        // Print the substrings
        System.out.println("Substring from index 7: " + substring1); // Output: World!
        System.out.println("Substring from index 7 to 12: " + substring2); // Output: World
    }
}

/*
The substring() method in the String class is used to extract a substring from a string. 
It takes one or two arguments: 
- If only one argument is provided, it returns a substring starting from the specified index to the end of the string.
- If two arguments are provided, it returns a substring starting from the first index and ending at the second index (excluding the second index).
*/
