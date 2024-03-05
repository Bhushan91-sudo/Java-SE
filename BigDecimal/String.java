/**
 * Problem Description

"A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)

This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"

The elements of a String are called characters. The number of characters in a string is called the length, and it can be retrieved with the String.length() method.

Some important methods for Strings in Java:

stringName.charAt(index) : returns char value for the particular index
stringName.isEmpty() : checks if string is empty.(Return type boolean).
Learn more about strings and its methods by clicking here.

Task:

Given two strings of lowercase English letters, A  and B, perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
Capitalize the complete string A and B and print them on a single line, separated by a space.

Input Format

The first line contains string A. The second line contains another string B. The strings are comprised of only lowercase English letters.


Output Format

There are three lines of output:

For the first line, sum the lengths of A and B.

For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.

For the third line, Capitalize the complete string A and B and print them on a single line, separated by a space.


Example Input

Input 1:

 abc
 def


Example Output

Output 1:

 6
 No
 ABC DEF

Example Explanation

Explanation 1:

 Length of A = 3 and B = 3 so len(A) + len(B) = 6
 String "abc" is lexicographically smaller than "def"
 */
import java.lang.*;
import java.util.*;

public class String {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        // Read the input strings A and B
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        // Step 1: Sum the lengths of A and B
        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);

        // Step 2: Determine if A is lexicographically greater than B
        String comparisonResult = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(comparisonResult);

        // Step 3: Capitalize the strings A and B
        String capitalizedA = A.toUpperCase();
        String capitalizedB = B.toUpperCase();
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
