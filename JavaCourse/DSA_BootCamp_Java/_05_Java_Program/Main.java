package JavaCourse.DSA_BootCamp_Java._05_Java_Program;
import java.util.Scanner;

/* First Java Program:
    - Input / Output
    - Primitive Data Types
    - Type Conversion and Casting
    - Loops
        - While Loops
        - For Loops
        - Temperature Program
    - Operators


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
    - Primitive data types are those data types which are not breakable into smaller parts.
    - Primitive data types are NOT breakable
        CANNOT break a char, int or float into smaller parts.
    - String is not a primitive data types but can be divided into characters.
        String "Dhruv" can be divided into characters 'D', 'h', 'r', 'u', 'v'.
    - There are 8 primitive data types in Java.
    - They are:
        
        1. int - Store numeric digits i.e int i = 10;
        2. long - Store larger numeric numbers i.e long l = 158789465465189L;
        3. float - Store floating point numbers i.e float f = 10.5f;
        4. double - Store larger decimal numbers i.e double d = 48621.54897;
        5. boolean - Store true or false values i.e boolean b = true;
        6. char - Store a single character i.e char c = 'a';
        7. byte - Store smallest numbers i.e byte b = 100;
            It has a minimum value of -256 and a maximum value of 256 (inclusive)
        8. short - Store smaller numbers i.e short s = 1000 ;
            It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
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

        try (Scanner input = new Scanner(System.in)) {
            // next() - It will take ONE word input ONLY till a space occurs
            // nextLine() - It will take the whole line as input.
            //System.out.println(input.next());

            String name = input.nextLine();
            System.out.println("Your name is: " + name);

            System.out.print("Enter a number: ");
            // nextInt() - It a function used to take input of type int ONLY and it returns the value. 1 42 541 5 
            // nextFloat() - It a function used to take input of type float ONLY. 1.0 42.0 541.0 5.0
            int integer1 = input.nextInt();

            System.out.print("Enter another number: ");
            int integer2 = input.nextInt();
            int sum = integer1 + integer2;
            System.out.println("The sum of " + integer1 + " and " + integer2 + " is " + sum);

            //System.out.println(input.nextFloat());
            
            // You can use _ to make the number more readable.
            int million = 234_000_000;
            System.out.println(million);

            PrimitiveDataTypes.roll();
            TypeConversionAndCasting.Casting();
            Loops.WhileLoops();
            Loops.ForLoops();
            //Loops.TemperatureProgram();
            Operators.main(args);
            PracticeAssignments.One();

        }
        
    }

    public class PrimitiveDataTypes {

        // Data Types

        int rollNumber = 64;

        // char are stored in single quotes. String are stored in double quotes.
        char letter = 'A';

        // floats must have f at the end of the number to denote that it is a float.
        float marks = 98.67f;

        // long must have L at the end of the number to denote that it is a long.
        long largeNumbers = 456789456789L;

        boolean isTrue = true;

        double largeDecimalNumbers = 4567543456.456789;
        
        public static void roll() {
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("Please enter some input: ");
                int roll = input.nextInt();
                System.out.println("Your roll number is: " + roll);
                

            }
        }
    }

    
    public class SumOfTwoNumbers {
        public static void Sum() {
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("Enter the first number: ");
                int num1 = input.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = input.nextInt();
                int sum = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
            }
        }
    }
    

    
    public class TypeConversionAndCasting {
        public static void Casting() {
            // Type Conversion
            // Widening Casting - Converting a smaller type to a larger type size.
            // byte -> short -> char -> int -> long -> float -> double
            // Narrowing Casting - Converting a larger type to a smaller size type.
            // double -> float -> long -> int -> char -> short -> byte

            // Type Casting
            // Widening Casting - Automatic Type Casting
            // Narrowing Casting - Manual Type Casting

            // Automatic Type Casting
            int a = 10;
            float b = a;
            System.out.println(b); // prints float as b is a float.

            // Manual Type Casting
            double c = 10.5;
            int d = (int) c;
            System.out.println(d);

            byte byt = 50;
            //byt = byt * 2; // This will give an error as the result of b * 2 is an int and b is a byte.
            byt = (byte) (byt * 2); // This will work as we are casting the result of b * 2 to a byte.
            System.out.println(byt); // prints 100

            int numberA = 'A';
            System.out.println(numberA); // Prints the ASCII value of A.


            byte byteA = 42;
            char charA = 'a';
            short shortA = 1024;
            int intA = 50000;
            float floatA = 5.67f;
            double doubleA = .1234;

            // The result of the expression is a double.
            // byteA is converted to int.
            // charA is converted to int.
            // shortA is converted to int.
            // floatA is converted to double.
            // doubleA is converted to double.
            // float + int + int - double = double
            double result = (floatA * byteA) + (intA / charA) - (doubleA * shortA);
            System.out.println((floatA * byteA) + " + " + (intA / charA) + " - " + (doubleA * shortA));
            System.out.println("result = " + result);

        }
    }


    public class Loops {
        public static void WhileLoops(){
            // While Loop
            // It will execute the code inside the loop as long as the condition is true.
            // It will check the condition first and then execute the code inside the loop.
            // It will execute the code inside the loop at least once.
            // It will execute the code inside the loop until the condition is false.
            
            // set the value of i to 0
            int i = 0;

            // while the value of i is less than 5
            while (i < 5) {

                // print the value of i
                System.out.println(i);

                // increment the value of i by 1
                i++;
            }
        }

        public static void ForLoops(){
            // For Loop
            
            // for (initialization; condition; increment/decrement) {
            //     // code to be executed
            // }

            // initialization - It is executed only once when the loop starts.
            // condition - It is executed every time before the code inside the loop is executed. If the condition is true, the code inside the loop is executed. If the condition is false, the code inside the loop is not executed.
            // increment/decrement - It is executed every time after the code inside the loop is executed.
            
            // start the loop from 1 and end at 5 (5 is not included) and increment the value of count by 1.
            for (int count = 1; count < 5; count++) {

                // print the value of count
                System.out.println(count);
            }
        }

        public static void TemperatureProgram(){
            try (Scanner in = new Scanner(System.in)) {
                System.out.print("Enter the temperature in Celsius: ");
                float tempC = in.nextFloat();
                float tempF = (tempC * 9/5) + 32;
                System.out.println("The temperature in Fahrenheit is: " + tempF);
            }
        }
    }

    public class Operators {
        public static void main(String[] args) {
            // Assignment Operators
            // =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=

            int a = 10;
            int b = 20;
            int c = 0;

            c = a + b;
            System.out.println("c = a + b = " + c);

            c += a;
            System.out.println("c += a = " + c);

            c -= a;
            System.out.println("c -= a = " + c);

            c *= a;
            System.out.println("c *= a = " + c);

            a = 10;
            c = 15;
            c /= a;
            System.out.println("c /= a = " + c);

            a = 10;
            c = 15;
            c %= a;
            System.out.println("c %= a = " + c);

            c <<= 2;
            System.out.println("c <<= 2 = " + c);

            c >>= 2;
            System.out.println("c >>= 2 = " + c);

            c &= a;
            System.out.println("c &= 2 = " + c);

            c ^= a;
            System.out.println("c ^= a = " + c);

            c |= a;
            System.out.println("c |= a = " + c);
        }
    }
}

