import java.util.Arrays;
import java.util.Scanner;

public class FunctionsNMethods {
    /* Functions are a block of code that performs a specific task
     * Functions are also known as methods
     * 
     * Syntax:
     * access_modifier return_type function_name (parameter1, parameter2, ...){
     *      // code
     *      return value;
     * }
     * 
    */

    /*
    static void SumOfTwoNumbers(){

        // Q: Write a program to find the sum of two numbers
        int num1, num2, sum;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter number 1: ");
        num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
    */

    // Function to find the sum of two numbers that are passed as parameters
    static void SumOfTwoNumbers(int num1, int num2){
        
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    // Return a value from a function
    static int SumOfTwoNumbers2(int num1, int num2){
        
        int sum = num1 + num2;
        return sum;

        // Anything after the return statement will not be executed
    }

    // Return a String from a function
    static String Greet() {
        return "Hello World";
    }

    static String MyGreet(String name){
        return "Hello " + name;
    }

    // Swap two numbers
    static int Swap(int num1, int num2){
        int temp = num1; // temp = 10
        num1 = num2; // num1 = 20
        num2 = temp; // num2 = 10
        return num1; // return 20

    }

    // Pass a string to a function
    // Strings are immutable in Java 
    //  meaning that once a string is created, it cannot be changed
    // Hence, if you make a change to the string via this ref variable, it will not be reflected in the original string

    static void ChangeName(String name){
        name = "John";
    }

    // Pass an array to a function
    static void ChangeValue(int [] num){

        // if you make a change to the object via this ref variable, it will be reflected in the original object
        num[0] = 100; // num = [100, 3, 2, 45, 6]
    }

    public class Scope{

        // Scope of a variable is the region of the program where the variable is accessible
        // Scope of a variable is defined by the curly braces in which the variable is declared
        // Variables declared inside a function are local variables and are accessible only within that function
        // Variables declared outside a function are global variables and are accessible within the entire program
        
        // A variable declared inside a block is accessible only within that block
        // Cannot be reinitialized within the same block within the function within the { }
        // Any variable that is outside the block is accessible inside
        // But any variable that is inside the block is not accessible outside the block
        public static void Scoping(){
                
                int num = 10; // global variable
                System.out.println(num);
    
                if (num == 10){
                    int num2 = 20; // local variable
                    System.out.println(num2);
                }
                // System.out.println(num2); // error because num2 is not accessible outside the if block
        }

        public static void BlockScope(){
            int a = 10;
            int b = 20;
            int c = 30; 
            String name = "Hello";
            {
                // int c = 30; // error because c is already declared in the if block
                
                //a is changed to 100
                a = 100;

                // d is a new variable and is not the same as d in the if block
                int d = 40; // d is accessible only within this block

                // name is accessible because it is declared outside the if block
                //System.out.println(name);

                name = "World"; // name is changed to "World"
                System.out.println(name);

                // values initialized in the if block are not accessible outside the if block or within blocks
                // blocks are { } and not ( )
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("c = " + c);
                System.out.println("d = " + d);
            }           
            
            int d = 50; // d is a new variable and is not the same as d in the if block
            System.out.println("d = " + d);

            // d = 50; // error because d is not accessible outside the if block cannot update d

        }

        public static void LoopScope(){
            int a = 10;
            int b = 20;
            int c = 30; 
            String name = "Hello";

            for (int i = 0; i < 5; i++){
                // int c = 30; // error because c is already declared in the if block
                
                //a is updated to 100
                a = 100;

                // d is a new variable and is not the same as d in the if block
                int d = 40; // d is accessible only within this block

                // name is accessible because it is declared outside the if block
                //System.out.println(name);

                name = "World"; // name is changed to "World"
                System.out.println(name);

                // values initialized in the if block are not accessible outside the if block or within blocks
                // blocks are { } and not ( )
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("c = " + c);
                System.out.println("d = " + d);
            }

            // i is not accessible outside the for loop
            //System.out.println(i);

            // d = 50; // error because d is not accessible outside the for loop cannot update d
        }

        static int x = 10; // global variable // this will be shadowed by the local variable x in the function Shadowing
        public static void Shadowing(){
            // Shadowing is when a variable is declared with the same name as another variable in the same scope
            // The variable declared inside the block shadows the variable declared outside the block
            // The variable declared inside the block is accessible only within the block
            // The variable declared outside the block is accessible outside the block

            //System.out.prinln(x); // prints 10
            int x = 20; // local variable // scope will begin when value is initialized
            System.out.println(x); // prints 20
            X(); // prints 10
        }

        public static void X(){
            System.out.println(x); // takes the global variable x
        }
    }

    public class VariablesArguments {
        // ... is the variable arguments
        // int ...z will take unlimited amounts of arguments OF type int

        public static void VarArgs () {
            fun(1, 2, 3, 4, 5);
            fun(1, 2, 3);
            fun(1, 2);
            fun(1);
            fun();
            
        }

        static void fun(int ...z){ // variable arguments
            
            // prints the number of arguments
            System.out.println("Number of arguments: " + z.length);

            // for loop to print all the elements
            for (int i: z) {

                // prints the individual elements
                System.out.print(i + " ");
            }

            // prints the array
            System.out.println(Arrays.toString(z));
        }

        public static void MultipleArgs () {
            // Multiple arguments
            // You can pass int a, int b, String ...c and it will take 
            //  2 ints and unlimited strings
            // ... must be LAST in the parameter list

            Multiple(1,2, "Hello", "World");
        }

        static void Multiple(int a, int b, String ...c){
            System.out.println(a + " " + b);
            for (String i: c) {
                System.out.print(i + " ");
            }
        }
    }

    public class FunctionOverloading{
        // Function overloading is when you have multiple functions with the same name but different parameters
        // The compiler will decide which function to call based on the parameters passed
        // The return type of the function does not matter
        // The number of parameters must be different
        // The data type of the parameters must be different

        // To be able to have multiple functions with the same name, 
          // Different parameters must be passed
            // The parameters must be different in number or data type
            // The return type does not matter
          //  

        public static void Call(){
            System.out.println();
            System.out.println(Add(10, 20));
            System.out.println(Add(30.5, 40.5));
            System.out.println(Add(10, 20, 30));
        }

        static int Add(int a, int b){
            return a + b;
        }

        static double Add(double a, double b){
            return a + b;
        }

        static int Add(int a, int b, int c){
            return a + b + c;
        }
    }


    public static void main(String[] args){

        // Calling the function
        SumOfTwoNumbers (10, 20);
        System.out.println(SumOfTwoNumbers2(20, 40));
        System.out.println(Greet());
        System.out.println(MyGreet("John"));
        System.out.println(Swap(10, 20));

        int [] arr = { 1, 3 , 2, 45, 6};
        ChangeValue(arr);
        System.out.println(Arrays.toString(arr));

        String name = "Mike";
        ChangeName(name);
        System.out.println(name);

        Scope.Scoping();
        Scope.BlockScope();
        Scope.LoopScope();
        Scope.Shadowing();
        
        VariablesArguments.VarArgs();
        VariablesArguments.MultipleArgs();
        FunctionsNMethods.FunctionOverloading.Call();
    }
}
