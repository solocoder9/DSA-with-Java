public class Test {
    public static void main(String[] args) {

        // Create two strings with different cases
        String s1 = "Hello";
        String s2 = "hello";

        // Use equalsIgnoreCase() to compare the two strings
        boolean isEqual = s1.equalsIgnoreCase(s2);

        // Print the result of the comparison
        System.out.println("Are s1 and s2 equal ignoring case? " + isEqual); // Output: true
    }
}

/*
The equalsIgnoreCase() method in the String class is used to compare the contents of two strings 
ignoring their case. 
It returns true if the strings are equal when case is ignored, 
i.e., they have the same characters in the same order (case-insensitive comparison). 
Otherwise, it returns false.
*/
