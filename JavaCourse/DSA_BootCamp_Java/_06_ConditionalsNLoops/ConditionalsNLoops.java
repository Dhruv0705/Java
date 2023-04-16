//package Java.JavaCourse.DSA_BootCamp_Java._06_ConditionalsNLoops;
import java.lang.Math;
import java.util.Scanner;

public class ConditionalsNLoops {
    public class Conditions {
        public static void IfStatement() {
            /*
             * If statements are used to execute a block of code if a condition is true.
             * If - else statements -> Used to check the condition, it checks the Boolean
             * condition True or False.
             * Syntax:
             * if (condition) {
             * // code to be executed if condition is true
             * }
             * else {
             * // code to be executed if condition is false
             * }
             *
             * 
             */

            int salary = 25400;

            if (salary > 10000) {
                salary += 2000; // salary = salary + 2000;
            } else {
                salary += 1000; // salary = salary + 1000;
            }

            System.out.println(salary);

            // Multiple if-else statements
            if (salary > 10000) {
                salary += 2000;
            } else if (salary > 20000) {
                salary += 3000;
            } else if (salary > 30000) {
                salary += 4000;
            } else {
                salary += 1000;
            }
            System.out.println(salary);

        }
    }

    public class Loops {
        public static void ForLoop() {
            /*
             * For loop is used to execute a block of code a specified number of times will
             * iterate .
             * 
             * Syntax:
             * for (initialization; condition; increment/decrement) {
             * // code to be executed
             * }
             * 
             * Initialization: executed once, before the loop starts.
             * Condition: defines the condition for executing the loop.
             * Increment/Decrement: executed after each iteration.
             * 
             */

            // Print numbers from 1 to 5 [
            // System.out.println(1);
            // System.out.println(2);
            // System.out.println(3);
            // System.out.println(4);
            // System.out.println(5);
            // ]
            // Initialization: int i = 0; if i is less than 5,
            // then execute the loop and increment i by 1
            // until i is no longer less than 5.

            for (int i = 0; i < 5; i++) { // i = 0, 1, 2, 3, 4
                System.out.println(i);
            }

            for (int i = 1; i <= 5; i++) { // i = 1, 2, 3, 4, 5
                System.out.println(i);
            }

            // Print numbers from 5 to 1
            // Initialization: int i = 5; if i is greater than 0,
            // then execute the loop and decrement i by 1
            // until i is no longer greater than 0.
            for (int i = 5; i > 0; i--) { // i = 5, 4, 3, 2, 1
                System.out.println(i);
            }

            // Print numbers from 1 to n
            // Initialization: int i = 1; if i is less than or equal to n,
            // then execute the loop and increment i by 1
            // until i is no longer less than or equal to n.
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int InputNumber = input.nextInt();

            for (int num = 0; num < InputNumber; num++) {
                System.out.println("Hello World");
            }
        }

        public static void WhileLoop() {
            /*
             * While loop is used to execute a block of code as long as a condition is true.
             * While Loops are used when we DON'T know how many time the loop will be
             * executed.
             * 
             * Syntax:
             * while (condition) {
             * // code to be executed
             * // Increment/Decrement
             * 
             * }
             * 
             * 
             */

            int number = 1;
            while (number <= 5) {
                System.out.println("While Loop: " + number);
                number++;
            }
        }

        public static void DoWhileLoop() {
            /*
             * Do-While loop is used when we want to execute our statement at least ONCE.
             * It is called exit control loop because it checks the condition after
             * execution of statement.
             * 
             * 
             * Syntax:
             * do {
             * // code to be executed
             * // Increment/Decrement
             * } while (condition);
             * 
             * 
             */

            int number = 1;
            do {
                System.out.println("Do-While Loop: " + number);
                number++;
            } while (number <= 5);
        }

        /*
         * While Loop vs Do-While Loop
         * While Loop:
         * Used when number of iteration is not fixed.
         * Entry controlled loop.
         * No semicolon requires at the end of while loop.
         * Do-While Loop:
         * Used when we want to execute our statement at least ONCE.
         * Exit controlled loop.
         * Semicolon is required at the end of do-while loop.
         */
    }

    public class LoopsPractice {
        public static void LargestNumber() {
            // Q: Find the largest of the 3 numbers
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int a = input.nextInt();
            System.out.print("Enter second number: ");
            int b = input.nextInt();
            System.out.print("Enter third number: ");
            int c = input.nextInt();

            if (a > b && a > c) {
                System.out.print("The Largest number is: " + a);
            } else if (b > a && b > c) {
                System.out.print("The Largest number is: " + b);
            } else if (c > a && c > b) {
                System.out.print("The Largest number is: " + c);
            } else {
                System.out.print("There is no larger number");
            }

            System.out.print('\n');
        }

        public static void AlphabetCaseCheck() {
            // Q: Input a letter and weather a alphabet is upper case or lower case
            Scanner input = new Scanner(System.in);
            System.out.print("Enter A Character: ");
            char letter = input.next().trim().charAt(0);
            if (letter >= 'a' && letter <= 'z') {
                System.out.print("Your character is a lowercase");
            } else if (letter >= 'A' && letter <= 'Z') {
                System.out.print("Your character is Uppercase");
            }

        }

        public static void Fibonacci(){
            // Q: Find the nth fibonacci number
            /*
             * Example:
             * Fibonacci is the sum of the first two numbers 
             * 0, 1 , 1, 2, 3, 5, 8, 13, ...
             * a = 0
             * b = 1
             * n = 7th = 13
             * nth is the position starting at 0th
             * 
            */
            Scanner input = new Scanner(System.in);
            int a = 0;
            int b = 1;
            System.out.print("Nth Fibonacci number to find: ");
            int nth = input.nextInt();
            int count = 2;

            while (count <=nth){

                // Initialize a temporary variable set to the value of b
                int temp = b;

                // New b == b + a
                b = b + a;

                // set a to the temporary b value set in the beginning of the loop
                a = temp;

                // increment9nt count
                count ++;
            }
            System.out.print(b + " is the " + nth + "th Fibonacci number");
            System.out.print('\n');
        }

        public static void NumberOccurrence(){
        
            // Q: Find the number of occurrence of a number 
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a list of number: ");
            int number = input.nextInt();
            System.out.print("Enter a number to find the occurrence of: ");
            int occurrence = input.nextInt();
            int count = 0;
            
            while (number > 0){
                int digit = number % 10;
                if (digit == occurrence){
                    count ++;
                }
                number = number / 10;
            }
            System.out.print("The number of occurrence of " + occurrence + " is " + count);
            System.out.print('\n');
        }

        public static void ReverseNumber(){
            // Q: Reverse a number
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number to reverse: ");
            int number = input.nextInt();
            int reverse = 0;
            while (number > 0){
                // Set digit to the last digit of the number by using modulus 
                int digit = number % 10; // 1234 % 10 = 4

                // Set reverse to the reverse * 10 + digit
                reverse = reverse * 10 + digit; // 1234 * 10 + 4 = 12340 + 4 = 12344

                // Set number to the number / 10
                number = number / 10; // 1234 / 10 = 123
            }
            System.out.print("The reverse of the number is: " + reverse);
            System.out.print('\n');
        }

        public static void CalculatorProgram(){
            // Q: Take input from user till user does not press X or x
            Scanner input = new Scanner(System.in);
            int result = 0;

            while (true){
                System.out.print("Enter the operator: ");
                char operator = input.next().trim().charAt(0);

                if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                    System.out.print("Enter the first number: ");
                    int num1 = input.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = input.nextInt();

                    if (operator == '+'){
                        result = num1 + num2;
                    } else if (operator == '-'){
                        result = num1 - num2;
                    } else if (operator == '*'){
                        result = num1 * num2;
                    } else if (operator == '/'){
                        result = num1 / num2;
                    } else if (operator == '%'){
                        result = num1 % num2;
                    }
                    System.out.print(result);
                } else if (operator == 'x' || operator == 'X'){
                    break;
                } else {
                    System.out.print("Invalid Operator" + '\n');
                }
            }
        }
    }

    public class Assignment {
        public static void AreaOf(){
            Scanner input = new Scanner(System.in);
            String AreaOfString = "";
            double Area = 0;

            while (true){
                System.out.print("Enter Area Of __ [Circle , Triangle, Rectangle, Isosceles Triangle, Parallelogram, Rhombus, Equilateral Triangle]:  ");
                AreaOfString = input.nextLine();
                
                if (AreaOfString.equals("Circle")){
                    System.out.print("Enter Radius: ");
                    int Radius = input.nextInt();
                    System.out.print("Enter Diameter: ");
                    int Diameter = input.nextInt();
                    Area = Diameter * Radius * Radius;
                    break;
                }
                if (AreaOfString.equals("Triangle")){
                    System.out.print("Enter Base: ");
                    int Base = input.nextInt();
                    System.out.print("Enter Height: ");
                    int Height = input.nextInt();
                    Area = 1.0/2 * Base * Height;
                    break;
                }
                if (AreaOfString.equals("Rectangle")){
                    System.out.print("Enter Length: ");
                    int Length = input.nextInt();
                    System.out.print("Enter Width: ");
                    int Width = input.nextInt();
                    Area = Length * Width;
                    break;
                }
                if (AreaOfString.equals("Isosceles Triangle")){
                    System.out.print("Enter Base: ");
                    int Base = input.nextInt();
                    System.out.print("Enter Height: ");
                    int Height = input.nextInt();
                    Area = 1.0/2 * Base * Height;
                    break;
                }
                if (AreaOfString.equals("Parallelogram")){
                    System.out.print("Enter Base: ");
                    int Base = input.nextInt();
                    System.out.print("Enter Height: ");
                    int Height = input.nextInt();
                    Area = Base * Height;
                    break;
                }
                if (AreaOfString.equals("Rhombus")){
                    System.out.print("Enter Diagonal 1: ");
                    int Diagonal1 = input.nextInt();
                    System.out.print("Enter Diagonal 2: ");
                    int Diagonal2 = input.nextInt();
                    Area = 1.0/2 * Diagonal1 * Diagonal2;
                    break;
                }
                if (AreaOfString.equals("Equilateral Triangle")){
                    System.out.print("Enter Side: ");
                    int Side = input.nextInt();
                    Area = 1.0/4 * Side * Side /3 ;
                    break;
                }
                if (AreaOfString.equals("")){
                    break;
                }
                else {
                    System.out.print("Invalid Area Of __ " + '\n');
                }
            }
            System.out.print("Area of " + AreaOfString + "= " + Area);  
        }

        public static void Factorial(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number to find the factorial of: ");
            int number = input.nextInt();
            int factorial = 1;
            for (int i = 1; i <= number; i++){
                i *= factorial;
            }
            System.out.print("The factorial of " + number + " is " + factorial);
        }

        public static void ElectricBill(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the units consumed: ");
            int units = input.nextInt();
            double bill = 0;
            if (units <= 50){
                bill = units * 0.50;
            } else if (units <= 150){
                bill = 25 + (units - 50) * 0.75;
            } else if (units <= 250){
                bill = 100 + (units - 150) * 1.20;
            } else {
                bill = 220 + (units - 250) * 1.50;
            }
            System.out.print("Electric Bill = " + bill);
        }

        public static void Grade(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the marks: ");
            int marks = input.nextInt();
            if (marks >= 90){
                System.out.print("Grade A");
            } else if (marks >= 80){
                System.out.print("Grade B");
            } else if (marks >= 70){
                System.out.print("Grade C");
            } else if (marks >= 60){
                System.out.print("Grade D");
            } else if (marks >= 40){
                System.out.print("Grade E");
            } else {
                System.out.print("Grade F");
            }
        }

        public static void LeapYear(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the year: ");
            int year = input.nextInt();
            if (year % 4 == 0){
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        System.out.print("Leap Year");
                    } else {
                        System.out.print("Not a Leap Year");
                    }
                } else {
                    System.out.print("Leap Year");
                }
            } else {
                System.out.print("Not a Leap Year");
            }
        }

        public static void LargestNumber(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int number1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int number2 = input.nextInt();
            System.out.print("Enter the third number: ");
            int number3 = input.nextInt();
            if (number1 >= number2 && number1 >= number3){
                System.out.print("Largest number is " + number1);
            } else if (number2 >= number1 && number2 >= number3){
                System.out.print("Largest number is " + number2);
            } else {
                System.out.print("Largest number is " + number3);
            }
        }

        public static void AlphabetCaseCheck(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a character: ");
            char character = input.next().charAt(0);
            if (character >= 'a' && character <= 'z'){
                System.out.print("Lowercase");
            } else if (character >= 'A' && character <= 'Z'){
                System.out.print("Uppercase");
            } else {
                System.out.print("Invalid");
            }
        }

        public static void Fibonacci(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of terms: ");
            int terms = input.nextInt();
            int first = 0;
            int second = 1;
            int next;
            System.out.print("Fibonacci Series: ");
            for (int i = 1; i <= terms; i++){
                System.out.print(first + " ");
                next = first + second;
                first = second;
                second = next;
            }
        }

        public static void AverageNumber(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of terms: ");
            int terms = input.nextInt();
            int sum = 0;
            for (int i = 1; i <= terms; i++){
                System.out.print("Enter the number: ");
                int number = input.nextInt();
                sum += number;
            }
            System.out.print("Average = " + sum / terms);
        }

        public static void DiscountProduct(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the price of the product: ");
            int price = input.nextInt();
            System.out.print("Enter the discount percentage: ");
            int discount = input.nextInt();
            double discountedPrice = price - (price * discount / 100);
            System.out.print("Discounted Price = " + discountedPrice);
        }

        public static void DistanceBetweenTwoPoints(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the x coordinate of the first point: ");
            int x1 = input.nextInt();
            System.out.print("Enter the y coordinate of the first point: ");
            int y1 = input.nextInt();
            System.out.print("Enter the x coordinate of the second point: ");
            int x2 = input.nextInt();
            System.out.print("Enter the y coordinate of the second point: ");
            int y2 = input.nextInt();
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.print("Distance between the points = " + distance);
        }

        public static void CommissionPercentage(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the sales amount: ");
            int sales = input.nextInt();
            double commission;
            if (sales >= 0 && sales <= 5000){
                commission = sales * 0.02;
            } else if (sales >= 5001 && sales <= 10000){
                commission = sales * 0.05;
            } else if (sales >= 10001 && sales <= 20000){
                commission = sales * 0.07;
            } else {
                commission = sales * 0.10;
            }
            System.out.print("Commission = " + commission);
        }

        public static void DepreciationValue(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the cost price: ");
            int costPrice = input.nextInt();
            System.out.print("Enter the salvage value: ");
            int salvageValue = input.nextInt();
            System.out.print("Enter the life of the product: ");
            int life = input.nextInt();
            double depreciation = (costPrice - salvageValue) / life;
            System.out.print("Depreciation = " + depreciation);
        }

        public static void BattingAverage(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of runs scored: ");
            int runs = input.nextInt();
            System.out.print("Enter the number of innings played: ");
            int innings = input.nextInt();
            System.out.print("Enter the number of not outs: ");
            int notOuts = input.nextInt();
            double battingAverage = runs / (innings - notOuts);
            System.out.print("Batting Average = " + battingAverage);
        }

        public static void CompoundInterest(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the principal amount: ");
            int principal = input.nextInt();
            System.out.print("Enter the rate of interest: ");
            int rate = input.nextInt();
            System.out.print("Enter the time period: ");
            int time = input.nextInt();
            double compoundInterest = principal * Math.pow((1 + rate / 100), time);
            System.out.print("Compound Interest = " + compoundInterest);
        }

        public static void ReverseString(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the string: ");
            String string = input.nextLine();
            String reverse = "";
            for (int i = string.length() - 1; i >= 0; i--){
                reverse += string.charAt(i);
            }
            System.out.print("Reverse String = " + reverse);
        }

        public static void SumNumber(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int number = input.nextInt();
            int sum = 0;
            while (number != 0){
                sum += number % 10;
                number /= 10;
            }
            System.out.print("Sum = " + sum);
        }

        public static void Palindrome(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the string: ");
            String string = input.nextLine();
            String reverse = "";
            for (int i = string.length() - 1; i >= 0; i--){
                reverse += string.charAt(i);
            }
            if (string.equals(reverse)){
                System.out.print("Palindrome");
            } else {
                System.out.print("Not Palindrome");
            }
        }

        public static void VowelOrConsonant(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the character: ");
            char character = input.next().charAt(0);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                System.out.print("Vowel");
            } else {
                System.out.print("Consonant");
            }
        }

        public static void DayOff(){
            // Dhruv is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
            int days = 0;
            for (int i = 1; i <= 31; i++){
                if (i % 2 == 0){
                    days++;
                }
            }
            System.out.print("Days = " + days);
        }

        public static void SumOfDigits(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int number = input.nextInt();
            int sum = 0;
            while (number != 0){
                sum += number % 10;
                number /= 10;
            }
            System.out.print("Sum = " + sum);
        }

        public static void SumOfList(){
            // Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
            Scanner input = new Scanner(System.in);
            int sumOfNegative = 0;
            int sumOfPositiveEven = 0;
            int sumOfPositiveOdd = 0;
            while (true){
                System.out.print("Enter the number: ");
                int number = input.nextInt();
                if (number == 0){
                    break;
                } else if (number < 0){
                    sumOfNegative += number;
                } else if (number % 2 == 0){
                    sumOfPositiveEven += number;
                } else {
                    sumOfPositiveOdd += number;
                }
            }
            System.out.print("Sum of Negative = " + sumOfNegative + " Sum of Positive Even = " + sumOfPositiveEven + " Sum of Positive Odd = " + sumOfPositiveOdd); 
        }

        
    }


    public static void main(String[] args) {
        ConditionalsNLoops.Conditions.IfStatement();
        ConditionalsNLoops.Loops.ForLoop();
        ConditionalsNLoops.Loops.WhileLoop();
        ConditionalsNLoops.Loops.DoWhileLoop();
        ConditionalsNLoops.LoopsPractice.LargestNumber();
        ConditionalsNLoops.LoopsPractice.AlphabetCaseCheck();
        ConditionalsNLoops.LoopsPractice.Fibonacci();
        ConditionalsNLoops.LoopsPractice.NumberOccurrence();
        ConditionalsNLoops.LoopsPractice.ReverseNumber();
        ConditionalsNLoops.LoopsPractice.CalculatorProgram();
        // /* 
        ConditionalsNLoops.Assignment.AreaOf();
        ConditionalsNLoops.Assignment.ElectricBill();
        ConditionalsNLoops.Assignment.Grade();
        ConditionalsNLoops.Assignment.LeapYear();
        ConditionalsNLoops.Assignment.AlphabetCaseCheck();
        ConditionalsNLoops.Assignment.Fibonacci();
        ConditionalsNLoops.Assignment.AverageNumber();
        ConditionalsNLoops.Assignment.DiscountProduct();
        ConditionalsNLoops.Assignment.DistanceBetweenTwoPoints();
        ConditionalsNLoops.Assignment.CommissionPercentage();
        ConditionalsNLoops.Assignment.DepreciationValue();
        ConditionalsNLoops.Assignment.BattingAverage();
        ConditionalsNLoops.Assignment.CompoundInterest();
        ConditionalsNLoops.Assignment.ReverseString();
        ConditionalsNLoops.Assignment.SumNumber();
        ConditionalsNLoops.Assignment.Palindrome();
        ConditionalsNLoops.Assignment.VowelOrConsonant();
        ConditionalsNLoops.Assignment.DayOff();
        ConditionalsNLoops.Assignment.SumOfDigits();
        ConditionalsNLoops.Assignment.SumOfList();
        // */ 
    }
}
