/**
 * Problem Description

The BigDecimal class provides operations on double numbers for arithmetic, scale handling, rounding, comparison, format conversion and hashing. It can handle very large and very small floating-point numbers with great precision but compensating with the time complexity a bit.
A BigDecimal consists of a random precision integer unscaled value and a 32-bit integer scale. If greater than or equal to zero, the scale is the number of digits to the right of the decimal point. If less than zero, the unscaled value of the number is multiplied by 10^(-scale).

Syntax:

Declaration

double a, b;  
BigDecimal A, B;
Initialization:

a = 5.4;  
b = 2.3;  
A = BigDecimal.valueOf(5.4);  
B = BigDecimal.valueOf(2.3);
If you are given a String representation of a double number then you can initialize in the following manner:

A = new BigDecimal(“5.4”);  
B = new BigDecimal(“1238126387123.1234”);
Extraction of value from BigDecimal:

// value should be in limit of double x  
double x = A.doubleValue();

// To get string representation of BigDecimal A  
String z = A.toString();
Comparison:

if (a < b) {} // For primitive double  
if (A.compareTo(B) < 0) {} // For BigDecimal
Actually compareTo returns -1(less than), 0(Equal), 1(greater than) according to values.

For equality we can also use:

if (A.equals(B)) {} // A is equal to B  
To read more about BigDecimal and its methods Click Here.

Task:

Given an array, s, of n real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that .1  is printed as .1, and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values (e.g. .1 is equivalent to 0.1), then they must be listed in the same order as they were received as input).

Complete the code in the editor below. You must rearrange array s's elements according to the instructions above.


Problem Constraints

1 <= n <= 200

Each si has atmost 300 digits.



Input Format

The first line consists of a single integer,n, denoting the number of integer strings.

Each line i of the n subsequent lines contains a real number denoting the value of si .



Output Format

Pre-written code in the editor will print the contents of array s to stdout. You are only responsible for reordering the array's elements.



Example Input

Sample Input:

 9
 -100
 50
 0
 56.6
 90
 0.12
 .12
 02.34
 000.000


Example Output

Sample Output:

 90
 56.6
 50
 02.34
 0.12
 .12
 0
 000.000
 -100

 */
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of real number strings
        int n = scanner.nextInt();
        scanner.nextLine();

        // Read the real number strings
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextLine();
        }

        // Convert each string to a BigDecimal object
        BigDecimal[] bigDecimals = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            bigDecimals[i] = new BigDecimal(s[i]);
        }

        // Sort the BigDecimal objects in descending order
        Arrays.sort(bigDecimals, Collections.reverseOrder());

        // Print each BigDecimal object in its original string format
        for (BigDecimal bd : bigDecimals) {
            System.out.println(bd.toPlainString());
        }
    }
}