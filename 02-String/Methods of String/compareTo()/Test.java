public class Test {
    public static void main(String[] args) {

        // Create two strings
        String s1 = "Hello";
        String s2 = "World";

        // Compare s1 and s2 lexicographically
        int result = s1.compareTo(s2);

        // Print the result
        if (result < 0) {
            System.out.println(s1 + " is less than " + s2);
        } else if (result > 0) {
            System.out.println(s1 + " is greater than " + s2);
        } else {
            System.out.println(s1 + " is equal to " + s2);
        }
    }
}

/*
The compareTo() method in the String class is used to compare two strings lexicographically. 
It returns an integer value that indicates the relationship between the two strings:
- If the result is less than 0, then the first string is lexicographically less than the second string.
- If the result is greater than 0, then the first string is lexicographically greater than the second string.
- If the result is 0, then the two strings are lexicographically equal.
In lexicographical order, strings are compared based on the Unicode value of their characters, 
which is similar to the order in which words are listed in a dictionary or sorted alphabetically.
*/
