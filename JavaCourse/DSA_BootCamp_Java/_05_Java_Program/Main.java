package JavaCourse.DSA_BootCamp_Java._05_Java_Program;
import java.util.Scanner;

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

        // Input / Output
        // The scanner class is used to get the input from the user.
        // Input - Taking input from the user.
        // new - It is a keyword used to create an object in Java.
        // Scanner - It is a class.
        // System.in - System is a class and in is a variable that denotes we are taking input from standard input stream. 
        // out - It is a variable that denotes we are taking output from standard output stream. In this case we can use System.out.println() to print the output to display a message to later take an input from the user.
        
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);

        // next() - It will take ONE word input ONLY till a space occurs
        // nextLine() - It will take the whole line as input.
        System.out.println(input.next());
        System.out.println(input.nextLine());

        System.out.print("Enter a number: ");
        // nextInt() - It a function used to take input of type int ONLY and it returns the value. 1 42 541 5 
        // nextFloat() - It a function used to take input of type float ONLY. 1.0 42.0 541.0 5.0
        System.out.print(input.nextInt());
        System.out.println(input.nextFloat());

        


        
    }
}
