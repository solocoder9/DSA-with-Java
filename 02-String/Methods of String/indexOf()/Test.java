public class Test {
    public static void main(String[] args) {

        // Create a string
        String s = "Hello, World!";

        // Find the index of the first occurrence of 'o'
        int index1 = s.indexOf('o');

        // Find the index of the first occurrence of "World"
        int index2 = s.indexOf("World");

        // Find the index of 'o' starting from index 5
        int index3 = s.indexOf('o', 5);

        // Find the index of "World" starting from index 5
        int index4 = s.indexOf("World", 5);

        // Print the indices
        System.out.println("Index of 'o': " + index1); // Output: 4
        System.out.println("Index of 'World': " + index2); // Output: 7
        System.out.println("Index of 'o' starting from index 5: " + index3); // Output: 7
        System.out.println("Index of 'World' starting from index 5: " + index4); // Output: -1 (not found)
    }
}

/*
The indexOf() method in the String class is used to find the index of the first occurrence of a specified character or substring in a string. 
It returns the index of the first occurrence of the specified character or substring, or -1 if the character or substring is not found. 
The method also has an overloaded version that allows you to specify a starting index from where the search should begin.
*/
