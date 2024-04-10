public class Test {
    public static void main(String[] args) {

        // Create two strings with the same value
        String s1 = "Hello";
        String s2 = "Hello";

        // Use equals() to compare the two strings
        boolean isEqual = s1.equals(s2);

        // Print the result of the comparison
        System.out.println("Are s1 and s2 equal? " + isEqual); // Output: true
    }
}

/*
The equals() method in the String class is used to compare the contents of two strings. 
It returns true if the strings are equal, i.e., they have the same characters in the same order. 
Otherwise, it returns false. 
*/
