
/* https://www.interviewbit.com/problems/arraylist/*/

/*In Java, we need to declare the size of an array before we can use it. Once the size of an array is declared, it's hard to change it.

To handle this issue, we can use the ArrayList class. It allows us to create resizable arrays.

Unlike arrays, arraylists can automatically adjust its capacity when we add or remove elements from it. Hence, arraylists are also known as dynamic arrays

Syntax of Creating an ArrayList:

// create Integer type arraylist
ArrayList arrayList = new ArrayList<>()
In the above program, we have used Integer not int. It is because we cannot use primitive types while creating an arraylist. Instead, we have to use the corresponding wrapper classes.

Basic syntax:

ArrayListName.size() : use this to get the size of arraylist.
ArrayListName.add(x) : Use this to append an element x to the ArrayList.
ArrayListName.get(i) : use this to access the ith index element in the ArrayList. Remember ArrayList uses 0 based indexing. */


import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        int num;
        while ((num = scanner.nextInt()) >= 0) {
            arrayList.add(num);
        }
        
        for (int i = arrayList.size() -1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
        
    }
}