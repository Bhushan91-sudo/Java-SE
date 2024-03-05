/**
 * Problem Description

A prime number is a natural number greater than 1 whose only positive divisors are 1 and itself. For example, the first six prime numbers are 2, 3, 5, 7, 11, and 13.

Given a large integer, n , use the Java BigInteger class’ isProbablePrime method to determine and print whether it’s prime or not prime.


Problem Constraints

n contains at-most 100 digits.


Input Format

A single line containing a numeric string denoting the large integer n, (the number to be checked).


Output Format

If n is a prime number, print prime; otherwise, print not prime.


Example Input

Input 1:

13


Example Output

Output 1:

prime
 */

import java.lang.*;
import java.util.*;
import java.math.BigInteger;

public class Primality_test {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
         Scanner scanner = new Scanner(System.in);

        // Read the large integer as a string
        String n = scanner.nextLine();

        // Create a BigInteger object from the input string
        BigInteger num = new BigInteger(n);

        // Check if the number is prime using isProbablePrime method
        if (num.isProbablePrime(100)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}