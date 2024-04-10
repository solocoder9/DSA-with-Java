public class Test {
    public static void main(String[] args) {

        // Create a string
        String s = "Hello, World! Hello!";

        // Find the index of the last occurrence of 'o'
        int lastIndex1 = s.lastIndexOf('o');

        // Find the index of the last occurrence of "Hello"
        int lastIndex2 = s.lastIndexOf("Hello");

        // Find the index of 'o' before index 10
        int lastIndex3 = s.lastIndexOf('o', 10);

        // Find the index of "Hello" before index 10
        int lastIndex4 = s.lastIndexOf("Hello", 10);

        // Print the last indices
        System.out.println("Last index of 'o': " + lastIndex1); // Output: 13
        System.out.println("Last index of 'Hello': " + lastIndex2); // Output: 13
        System.out.println("Last index of 'o' before index 10: " + lastIndex3); // Output: 7
        System.out.println("Last index of 'Hello' before index 10: " + lastIndex4); // Output: 0
    }
}

/*
The lastIndexOf() method in the String class is used to find the index of the last occurrence of a specified character or substring in a string. 
It returns the index of the last occurrence of the specified character or substring, or -1 if the character or substring is not found. 
The method also has an overloaded version that allows you to specify a starting index from where the search should begin.
*/
