import java.util.Scanner;

public class Assignment1 {
    
    public static void One(){

        // Write a program to print whether a number is even or odd, also take input from the user.
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();

        if (a % 2==0){
            System.out.println("Your Number is Even");
        }
        else{
            System.out.println("Your Number is Odd");
        }
        
    }
    

    public static void Two(){

        // Take name as input and print a greeting message for that particular name.
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.next();

        System.out.print("Hello " + name + '\n');

        
    }

    public static void Three(){
        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner input = new Scanner(System.in);
        System.out.print("Input Principal Amount: ");
        int PrincipalAmount = input.nextInt();
        System.out.print("Input Rate of Interest Amount: ");
        int RateOfInterest = input.nextInt();
        System.out.print("Input Time (Years): ");
        int Time = input.nextInt();

        float PTR = (PrincipalAmount * RateOfInterest * Time)/100;
        System.out.print("Simple Interest = " + PTR + '\n');
    
    }

    public static void Four(){
        //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner input = new Scanner(System.in);
        System.out.print("Choice an Operator [+, -, *, /] : ");
        char Operator = input.next().charAt(0);
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        System.out.print("Enter another number: ");
        int number2 = input.nextInt();
        int result = 0;

        if (Operator == '+') {
            result = number1 + number2;
            System.out.println(number1 + "+" + number2 + "=" +  result);
        }
        else if (Operator == '-'){
            result = number1 - number2;
            System.out.print(number1 + "-" + number2 + "=" + result);
        }
        else if (Operator == '*'){
            result = number1 * number2;
            System.out.print(number1 + "*" + number2 + "=" + result);
        }   
        else if (Operator == '/'){
            result = number1 / number2;
            System.out.print(number1 + "/" + number2 + "=" + result);
        }
        else{
            System.out.print("Wrong Operation");
        } 

        System.out.print("\n");
    }

    public static void Five(){
        //Take 2 numbers as input and print the largest number.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
        System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
        System.out.println(num2 + " is greater than " + num1);
        } else {
        System.out.println("Both numbers are equal.");
        }
    }

    public static void Six(){
        //Input currency in rupees and output in USD.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        double Rupees = input.nextDouble();

        double USD = Rupees / 75; // 1 USD = 75 INR

        System.out.println("Amount in USD: " + USD);

    }

    public static void Seven(){
        //Take values of length and breadth of a rectangle from user and check if it is square or not.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = input.nextDouble();

        if (length == breadth) {
            System.out.println("It is a square");
        } else {
            System.out.println("It is a rectangle");
        }
    }

    public static void Eight(){
        // To calculate Fibonacci Series up to n numbers.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
  
    }

    public static void Nine(){
        // To check whether a number is prime or not.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        boolean isPrime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public static void Ten(){
        // To print all prime numbers between 1 to n.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }

    public static void Eleven(){
        // To print all prime numbers in an interval of 1-100.
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }

    public static void Twelve(){
        // To check whether a number is Armstrong number or not.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int originalNumber = n;
        int result = 0;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }

    public static void Thirteen(){
        // To print all Armstrong numbers between 1 to n.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int originalNumber = i;
            int result = 0;

            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, 3);
                originalNumber /= 10;
            }

            if (result == i) {
                System.out.print(i + " ");
            }
        }
    }

    public static void Fourteen(){
        // To print all Armstrong numbers in an interval of 1-1000.
        for (int i = 1; i <= 1000; i++) {
            int originalNumber = i;
            int result = 0;

            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, 3);
                originalNumber /= 10;
            }

            if (result == i) {
                System.out.print(i + " ");
            }
        }
    }

    public static void Fifteen(){
        // To find the factorial of a number.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    public static void Sixteen(){
        //To find out whether the given String is Palindrome or not.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
    
        int length = str.length();
        boolean isPalindrome = true;
    
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
    
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static void main(String[] args){
        Assignment1.One();
        Assignment1.Two();
        Assignment1.Three();
        Assignment1.Four();
        Assignment1.Five();
        Assignment1.Six();
        Assignment1.Seven();
        Assignment1.Eight();
        Assignment1.Nine();
        Assignment1.Ten();
        Assignment1.Eleven();
        Assignment1.Twelve();
        Assignment1.Thirteen();
        Assignment1.Fourteen();
        Assignment1.Fifteen();
        Assignment1.Sixteen();
        
        
    }

}
