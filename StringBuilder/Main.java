/**
 * The StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates an immutable sequence of characters, the StringBuilder class provides an alternative to String Class, as it creates a mutable sequence of characters.

The function of StringBuilder is very much similar to the StringBuffer class, as both of them provide an alternative to String Class by making a mutable sequence of characters. However, the StringBuilder class differs from the StringBuffer class on the basis of synchronization.

The StringBuilder class provides no guarantee of synchronization whereas the StringBuffer class does. Therefore this class is designed for use as a drop-in replacement for StringBuffer in places where the StringBuffer was being used by a single thread (as is generally the case). Where possible, it is recommended that this class be used in preference to StringBuffer as it will be faster under most implementations. Instances of StringBuilder are not safe for use by multiple threads. If such synchronization is required then it is recommended that StringBuffer be used.

Constructors in Java StringBuilder:

StringBuilder(): Constructs a string builder with no characters in it and an initial capacity of 16 characters.
StringBuilder(int capacity): Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument.
StringBuilder(CharSequence seq): Constructs a string builder that contains the same characters as the specified CharSequence.
StringBuilder(String str): Constructs a string builder initialized to the contents of the specified string.
Methods in Java StringBuilder:

StringBuilder append(X x): This method appends the string representation of the X type argument to the sequence.
StringBuilder replace(int start, int end, String str): This method replaces the characters in a substring of this sequence with characters in the specified String.
StringBuilder reverse(): This method causes this character sequence to be replaced by the reverse of the sequence.
String toString(): This method returns a string representing the data in this sequence.
Task:

You need to complete the solve() method in the below code.

solve() method takes three arguments:

String S
Integer L
Integer R
You need to reverse the substring starting at index L and ending at index R in String S, and finally return the final string.

NOTE:

No need to take input or print anything.
Such a substring always exists.
Try to use StringBuilder to solve this problem.
 */

 import java.lang.*;
 import java.util.*;
 
 public class Main {
     public static void main(String[] args) {
         //Don't alter anything here.
         Scanner inp = new Scanner(System.in);
         String S = inp.nextLine();
         int L = inp.nextInt();
         inp.nextLine();
         int R = inp.nextInt();
         inp.nextLine();
         inp.close();
         
         System.out.println(solve(S,L,R));
         /**************************************/
     }
     
     //complete the function below
     
     public static String solve(String S, int L, int R)
     {
        StringBuilder sb = new StringBuilder(S);
         // Reverse the substring from index L to R
         String reversedSubstring = sb.substring(L, R + 1);
         sb.replace(L, R + 1, new StringBuilder(reversedSubstring).reverse().toString());
         return sb.toString();
     }
 }