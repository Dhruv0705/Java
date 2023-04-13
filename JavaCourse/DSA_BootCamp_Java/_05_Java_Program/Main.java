package JavaCourse.DSA_BootCamp_Java._05_Java_Program;

/* First Java Program:
    - Input / Output
    - Debugging
    - Data Types


Structure of a Java Program:
    - Everything in written in .java files must be in classes or we can say that
      everything in Java is a class.
    - Every class must have a main method.
    - A class with same name as file name must be present in the .java file.

Package:
    - It is a folder that contains .java files.
    - It is used to organize the code.
    - It is used to provide some rules and stuff to our program/project.

Primitive Data Types:
    - 


*/ 

// Public - Access Modifier it is used so that we can access the class from anywhere.
// Class - It is a blueprint of an object a name group of properties and methods/functions.
// Main - It is the name of the class [Filename]. 
public class Main {
    
    // Public - It is used to allow the program to use main function from anywhere.
    // Static - It is used so that we can access the main method without creating an object of the class.
    // Void - It is used so that the main method does not return anything. Don't return anything.
    // Main - It is the name of the method.
    // String[] args - It is the argument of the main method.

    public static void main(String[] args) {

        // System - It is a class.
        // Out - It is an object of the class System.
        // Println - It is a method of the class PrintStream.
        // "Hello World!" - It is the argument of the method Println.
        System.out.println("Hello World!");
        
    }
}
