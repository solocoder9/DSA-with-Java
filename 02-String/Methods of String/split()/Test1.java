public class Test1 {
    public static void main(String[] args) {
        // Create a string with "Hello, World!"
        String greeting = "Hello, World!";

        // Split the string into an array of words using split()
        String[] words = greeting.split(", ");

        // Print each word in the array using a for loop
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word: " + words[i]);
        }
    }
}

/*
- The split() method in the String class is used to split a string into an array of substrings based on a delimiter.
- In this example, the string "Hello, World!" is split into an array of two words, "Hello" and "World!", using ", " as the delimiter.
- The split() method returns an array containing each word as a separate element.
- The for loop is then used to iterate over the array and print each word.
*/
