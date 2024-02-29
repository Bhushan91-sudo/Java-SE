
/*https://www.interviewbit.com/problems/multidimensional-arrays/ */

/*A multidimensional array is an array of arrays. Each element of
 a multidimensional array is an array itself. For example,

int[][] arr = new int[3][4];
Here, we have created a multidimensional array named arr.
 It is a 2-dimensional array, that can hold a maximum of 12 elements, */

import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        int[][] matrix = new int[N][M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int[] columnSum = new int[M];
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                columnSum[j] += matrix[i][j];
            }
        }
        
        for (int sum : columnSum) {
            System.out.print(sum + " ");
        }
        scanner.close();
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
    }
}