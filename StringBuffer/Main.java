/**
 * StringBuffer is a peer class of String that provides much of the functionality of strings. String represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.

StringBuffer may have characters and substrings inserted in the middle or appended to the end. It will automatically grow to make room for such additions and often has more characters preallocated than are actually needed, to allow room for growth.

StringBuffer Constructors

StringBuffer( ): It reserves room for 16 characters without reallocation.
Syntax: StringBuffer s = new StringBuffer();
StringBuffer(String str): It accepts a String argument that sets the initial contents of the StringBuffer object and reserves room for 16 more characters without reallocation.
Syntax: StringBuffer s = new StringBuffer("InterviewBit");
Methods in StringBuffer Class:

length( ) and capacity( ): The length of a StringBuffer can be found by the length( ) method, while the total allocated capacity can be found by the capacity( ) method.
append( ): It is used to add text at the end of the existence text
insert( ): It is used to insert text at the specified index position.
reverse( ): It can reverse the characters within a StringBuffer object using reverse( ). This method returns the reversed object on which it was called.
StringBuffer replace(int startIndex, int endIndex, String str): It can replace one set of characters with another set inside a StringBuffer object by calling replace( ).
String toString(): This method returns a string representing the data in this sequence.
To read more about StringBuffer Class go here: https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html

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
      StringBuffer sb = new StringBuffer(S);
        // Reverse the substring from index L to R
        sb.replace(L, R + 1, new StringBuffer(S.substring(L, R + 1)).reverse().toString());
        return sb.toString();
    }
}