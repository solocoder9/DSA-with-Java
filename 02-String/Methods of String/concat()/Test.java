public class Test {
    public static void main(String[] args) {

        // Create a string
        String s1 = "Hello, ";
        String s2 = "World!";

        // Concatenate s2 to the end of s1
        String concatenated = s1.concat(s2);

        // Print the concatenated string
        System.out.println(concatenated); // Output: Hello, World!
    }
}

/*
The concat() method in the String class is used to concatenate two strings. 
It returns a new string that represents the concatenation of the two strings. 
The original strings remain unchanged.
*/
