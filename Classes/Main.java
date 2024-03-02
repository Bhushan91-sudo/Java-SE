/** Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A Class is like an object constructor, or a “blueprint” for creating objects.

Creating a Class:

To create a class, use the keyword class:

Syntax of creating a class named “car” with a variable x:

public class car {

  int x;

}
Create an Object
 In Java, an object is created from a class. We have already created the class named MyClass, so now we can use this to create objects.

To create an object of MyClass, specify the class name, followed by the object name, and use the keyword new:

For example:

 public class Main {
    int x = 5;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
Java Class Attributes
 In the above statement, we used the term “variable” for x in the example (as shown below). It is actually an attribute of the class. Or you could say that class attributes are variables within a class:

Example
 Create a class called “Main” with two attributes: x and y:

 
public class Main {  
     int x = 5;  
    int y = 3;  
 }
Java Constructors
 A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

Example
 Create a constructor:

// Create a Main class  
public class Main {
    int x; // Create a class attribute

    // Create a class constructor for the Main class  
    public Main() {
        x = 5; // Set the initial value for the class attribute x  
    }

    public static void main(String[] args) {
        Main myObj = new Main(); // Create an object of class Main (This will call the constructor)  
        System.out.println(myObj.x); // Print the value of x  
    }
}
Task:

Given a snippet below you need to create a class named pair in the code below along with following attributes:

An integer attribute named first.
An integer attribute named second.
Also after doing this you also need to write one constructor for this class which automatically initializes first with integer 10 and second with integer 20.*/

import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.nextLine();
        int b = inp.nextInt();
        inp.close();
        
        Pair obj  = new Pair();
        System.out.println(obj.first + obj.second);
        
        System.out.println(a*obj.first);
        
        System.out.println(b*obj.second);
        
        
    /*************************************************/
    }
}
class Pair {
    int first;
    int second;

    // Constructor to initialize first with 10 and second with 20
    public Pair() {
        first = 10;
        second = 20;
    }
}
