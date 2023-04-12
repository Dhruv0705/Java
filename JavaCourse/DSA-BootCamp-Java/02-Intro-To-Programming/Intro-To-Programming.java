/* Introduction To Programming : 
 *     Types of Languages
 *     Static vs Dynamic
 *     Memory Management
 * 
 *                  What is programming?
 * 
 *  - Programming is the process of writing instructions for a computer to execute.
 *  - Programming is a way to instruct the computer to perform various task.
 *  - Computer only understands Binary (0s and 1s)
 *  - Instructing computers in Binary are very difficult for humans so, to solve this issue we have programming languages.
 *  - Programming Languages - it is a computer language used by programmers to communicate with computers.
 * 
 * 
 *                  Types of Programming Languages
 *                      |          |            |
 *              Procedural Functional Object Oriented
 * 
 * Procedural - It is a programming paradigm that uses procedures to organize code.
 *            - Specifies a series of well-structured steps and procedures to compose a program.
 *            - Contains a systematic order of statements, functions and commands to complete a task. 
 *            - It is a declarative programming paradigm.
 *            - I.e. C, C++, Java, Python, etc.
 * 
 * Functional - It is a programming paradigm that treats computation as the evaluation of mathematical functions and avoids changing-state and mutable data.
 *            - Writing a program only in pure functions. i.e. never modify variables, but only create new ones as an output.
 *            - Used in situations where we have to perform lots of different operations on the same set of data, like machine learning.
 *            - It is a declarative programming paradigm.
 *            - I.e. Haskell, Lisp, Erlang, Python, etc.
 * 
 * Object Oriented - It is a programming paradigm that uses objects and their interactions to design and program applications.
 *                 - It is a declarative programming paradigm.
 *                 - Resolves around objects
 *                 - Objects are the building blocks of a program.
 *                 - Code + Data = Object
 *                 - Developed to make it easier to write large programs, develop, debug, reuse, and maintain software.
 *                 - I.e. Java, C++, Python, etc.
 * 
 *              Static vs Dynamic Programming Languages
 * 
 * Static:
 * 
 * - Static programming languages are those that require the programmer to specify the type of data that a variable will hold.
 * - The type of data that a variable will hold is specified at compile time.
 * - Preform type checking at compile time.
 * - Errors will show at compile time
 * - Declare datatype before you use it
 * - More control
 * - I.e. C, C++, Java, etc.
 * 
 *      int a = 10;
 *      String name = "John";
 * 
 *      You must specify the type of data that a variable will hold.
 *      You cannot change the type of data that a variable will hold.
 * 
 *      int a = 10;
 *      a = "John"; // Error
 * 
 * Dynamic:
 * 
 * - Dynamic programming languages are those that do not require the programmer to specify the type of data that a variable will hold.
 * - The type of data that a variable will hold is specified at run time.
 * - Preform type checking at run time.
 * - Errors will show at run time
 * - No need to declare datatype before you use it
 * - Saves time in writing code but might cause errors at runtime
 * - I.e. Python, Ruby, JavaScript, etc.
 * 
 *    a = 10;  
 *    a = "John"; // No error 
 * 
 *              Memory Management
 * 
 *  - It is the process of managing computer memory.
 * 
 *  There are 2 types of memory management:
 *       Stack and Heap 
 * 
 * - When we declare a variable then the reference variable stored in the stack a
 *       memory points to the object of that variable stored in heap memory.
 * 
 *  For example: 
 *        a = 10;
 * 
 *      - "a" is a reference variable stored in the stack memory.
 *      - 10 is an object stored in the heap memory.
 * 
 *      - Reference variables are stored in stack memory.
 *      - Objects of reference variables are stored in heap memory.
 * 
 * - More than one reference variable can point to the same object.
 * - If any changes made to the object of any reference variable that will be reflected to all others variable pointing to the same object.
 * - Java uses Garbage Collector to free up the memory. without reference variable pointing to the object, the object will be removed from the heap memory.
 * 
 * For example:
 *    a = [1, 2, 3, 4, 5]
 *    b = a
 * 
 *  a[0] = 10
 *  output: [10, 2, 3, 4, 5]
 *  b[0] = 20
 *  output: [20, 2, 3, 4, 5]
 * 
 * 
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 */