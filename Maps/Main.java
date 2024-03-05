/**
 * The Map interface of the Java collections framework provides the functionality of the map data structure.

It implements the Collection interface.

In Java, elements of Map are stored in key/value pairs. Keys are unique values associated with individual Values.

A map cannot contain duplicate keys. And, each key is associated with a single value.

Classes that implement Map:
Since Map is an interface, we cannot create objects from it.

In order to use functionalities of the Map interface, we can use these classes:

HashMap
EnumMap
LinkedHashMap
WeakHashMap
TreeMap
In Java, we must import the java.util.Map package in order to use Map. Once we import the package, here’s how we can create a map.

// Map implementation using HashMap
Map<String, Integer> contactList = new HashMap<>();
In the above code, we have created a Map named contact list. We have used the HashMap class to implement the Map interface.

The above map contains keys as String and values as integer like contactList[“Rishabh”] maps to an integer maybe 2.

The Map interface includes all the methods of the Collection interface. It is because Collection is a super interface of Map.

Besides methods available in the Collection interface, the Map interface also includes the following methods:

put(K, V) - Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.
putAll() - Inserts all the entries from the specified map to this map.
putIfAbsent(K, V) - Inserts the association if the key K is not already associated with the value V.
get(K) - Returns the value associated with the specified key K. If the key is not found, it returns null.
getOrDefault(K, defaultValue) - Returns the value associated with the specified key K. If the key is not found, it returns the defaultValue.
containsKey(K) - Checks if the specified key K is present in the map or not.
containsValue(V) - Checks if the specified value V is present in the map or not.
replace(K, V) - Replace the value of the key K with the new specified value V.
replace(K, oldValue, newValue) - Replaces the value of the key K with the new value newValue only if the key K is associated with the value oldValue.
To read more about maps and its methods follow this link: Click Here

LinkedHashMap in Java

The LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements inserted into it. HashMap provided the advantage of quick insertion, search, and deletion but it never maintained the track and order of insertion which the LinkedHashMap provides where the elements can be accessed in their insertion order. 

Important Features of a LinkedHashMap:

A LinkedHashMap contains values based on the key. It implements the Map interface and extends the HashMap class.
It contains only unique elements.
It may have one null key and multiple null values.
It is non-synchronized.
It is the same as HashMap with an additional feature that it maintains insertion order. For example, when we run the code with a HashMap, we get a different order of elements.
Task:

You are given an examination database that consists of student’s names and their total marks. After that, you will be given some student’s name as a query. For each query, print the total marks of that student.



Problem Constraints

1 <= NumberOfStudents, NumberOfQueries <= 105

1 <= totalMarks in any entry <= 109

1 <= |nameOf Student| <= 8



Input Format

The first line will have an integer A denoting the number of entries in the examination database. Each entry consists of two lines: a name and the corresponding total marks.

After these, the next line will contain an single integer Q denoting the number of queries.

The next Q lines each will contain a student’s name.



Output Format

For each case, print “Not found” if the student name has no entry in the examination database. Otherwise, print the total marks of that student. See sample output for the exact format.



Example Input

Input 1:

 3
 Ojas
 10
 Rishabh
 5
 Akash
 15
 2
 Aka
 Ojas


Example Output

Output 1:

 Not Found
 10


Example Explanation

Explanation 1:

 Query 1: Student named "Aka" is not present in our given database so we will print "Not Found"
 Query 2: Student named "Ojas" is present in our database so we will print the marks corresponding to it i.e 10
 */

 import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Read the number of entries in the database
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        // Create a LinkedHashMap to store student names and their marks
        Map<String, Integer> database = new LinkedHashMap<>();
        
        // Read the entries and store them in the database
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int marks = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            database.put(name, marks);
        }

        // Read the number of queries
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        // Process the queries
        for (int i = 0; i < q; i++) {
            String query = scanner.nextLine();
            if (database.containsKey(query)) {
                System.out.println(database.get(query));
            } else {
                System.out.println("Not Found");
            }
        }
        
        scanner.close();
    }
}
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output