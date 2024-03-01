/* In the previous problem, priority queue elements are retrieved in the natural order (ascending order). However, we can customize this ordering.

For this, we need to create our own comparator class that implements the Comparator interface.

To read more about this please find the resources here.

Task:

You need to think of a data structure and implement it such that it can help you in answering the below-mentioned queries.

You are given Q queries, in each query you are given two integers x and y:

if x = 1 then insert the integer y to your data structure.
if x = 2 then print an integer denoting the maximum element currently present in your data-structure, if there are no elements present then print -1
if x = 3 then remove the maximum element currently present in your data structure, if there is no element present then don’t do anything.


Problem Constraints

1 <= Q <= 105

1 <= x <= 3

1 <= y <= 1000

 

Input Format

First line of input contains a single integer Q.

Next, Q lines each contain two integers x and y for that query.


Output Format

For each query in which x = 2 print its answer in separate lines.*/

import java.lang.*;
import java.util.*;

class MaxElementStructure {
    PriorityQueue<Integer> maxHeap;

    public MaxElementStructure() {
        // Initialize the PriorityQueue with a custom comparator to sort elements in descending order
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void insert(int y) {
        maxHeap.offer(y); // Add the element to the PriorityQueue
    }

    public int getMax() {
        if (maxHeap.isEmpty()) {
            return -1; // If PriorityQueue is empty, return -1
        } else {
            return maxHeap.peek(); // Return the maximum element without removing it
        }
    }

    public void removeMax() {
        if (!maxHeap.isEmpty()) {
            maxHeap.poll(); // Remove the maximum element if PriorityQueue is not empty
        }
    }
}

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int Q = scanner.nextInt();
       MaxElementStructure MaxElementStructure = new MaxElementStructure();
       
       for (int i = 0; i < Q; i++) {
           int x = scanner.nextInt();
           int y = scanner.nextInt();
           
           if (x == 1) {
               MaxElementStructure.insert(y);
           }
           else if (x == 2) {
               System.out.println(MaxElementStructure.getMax());
           }
           else if (x == 3) {
               MaxElementStructure.removeMax();
           }
       }
       
       scanner.close();
        
    }
}