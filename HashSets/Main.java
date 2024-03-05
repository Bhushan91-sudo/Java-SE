/**
 * Problem Description

The Set interface of the Java Collections framework provides the features of the mathematical set in Java. It extends the Collection interface.

Unlike the List interface, sets cannot contain duplicate elements.

Since Set is an interface, we cannot create objects from it.

In order to use functionalities of the Set interface, we can use these classes:

HashSet
LinkedHashSet
EnumSet
TreeSet
In Java, we must import java.util.Set package in order to use Set.

// Set implementation using HashSet
Set<string> animals = new HashSet<>()
Here, we have created a Set called animals. We have used the HashSet class to implement the Set interface.

Methods of Set:

The Set interface includes all the methods of the Collection interface. It’s because Collection is a super interface of Set.

Some of the commonly used methods of the Collection interface that’s also available in the Set interface are:

add() - adds the specified element to the set
addAll() - adds all the elements of the specified collection to the set
remove() - removes the specified element from the set
clear() - removes all the elements from the set
size() - returns the length (number of elements) of the set
toArray() - returns an array containing all the elements of the set
contains() - returns true if the set contains the specified element
To learn about more methods of the Setinterface, visit Java Set (official Java documentation).

LinkedHashSet:

The LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements. When the iteration order is needed to be maintained this class is used. When iterating through a HashSet the order is unpredictable, while a LinkedHashSet lets us iterate through the elements in the order in which they were inserted. When cycling through LinkedHashSet using an iterator, the elements will be returned in the order in which they were inserted.

Task:

Given an integer array A you need to find the total number of unique elements in that array A.


Problem Constraints

1 <= |A| <= 105

1 <= A[i] <= 109

 

Input Format

The first-line contain a single integer N denoting the size of the array A.

Next N lines each contain a single integer denoting the array A elements.


Output Format

Print a single integer denoting the total number of unique elements in that array A.


Example Input

Input 1;

 5
 1
 1
 3
 1
 2



Example Output

Output 1;

 3
 Example Explanation

Explanation 1;

 Unique elements are : [1, 2, 3]
 */
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        
        // Create a Set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();
        
        // Read the elements of the array and add them to the Set
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            uniqueElements.add(num);
        }

        // Print the size of the Set, which represents the number of unique elements
        System.out.println(uniqueElements.size());
        
        scanner.close();
    }
}