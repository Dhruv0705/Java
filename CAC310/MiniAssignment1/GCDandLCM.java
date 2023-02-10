//  Dhruv Patel
//  2/11/2023
//  Write a program to compute the greatest common denominator (GCD) 
//      and the least common multiple (LCM) of two numbers. 
//      Ask the user to enter the two numbers. 
//      Write a function for the GCD and a function for the LCM.

package MiniAssignment1;
import java.util.Scanner;

public class GCDandLCM {

  // GCD Function to compute the GCD of two numbers using the formula: gcd(a, b) = gcd(b, a mod b)
  public static int GCD(int FirstNumber, int SecondNumber) {
    
    // Error Handling: if the SecondNumber is 0, then:
    if (SecondNumber == 0) {

      // return the FirstNumber
      return FirstNumber;
    }

    // returns the formula SecondNumber, and the remainder or modulo of FirstNumber divided by SecondNumber
    return GCD(SecondNumber, FirstNumber % SecondNumber);
  }

  // LCM Function to compute the LCM of two numbers using the formula: lcm(a, b) = a * b / gcd(a, b)
  public static int LCM(int FirstNumber, int SecondNumber) {


    // Error Handling: if the GCD of FirstNumber and SecondNumber is 0, then: 
    if (GCD(FirstNumber, SecondNumber) == 0) {

      // return 0
      return 0;
    }

    // returns the multiplication of FirstNumber and SecondNumber divided by the GCD of FirstNumber and SecondNumber
    return FirstNumber * SecondNumber / GCD(FirstNumber, SecondNumber);
  }

  // Main Function to display the GCD and LCM of two numbers inputted by the user
  public static void main(String[] args) {

    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Ask user to enter two numbers:
    // Ask the user to enter the FirstNumber
    System.out.println("Enter First Number: ");
    int FirstNumber = input.nextInt();

    // Ask the user to enter the SecondNumber
    System.out.println("Enter Second Number: ");
    int SecondNumber = input.nextInt();
  

    // Set the GCD and LCM variables by calling the GCD and LCM functions for the two inputted numbers
    int GreatestCommonDenominator = GCD(FirstNumber, SecondNumber);
    int LeastCommonMultiple = LCM(FirstNumber, SecondNumber);

    // Display the result of GCD and LCM
    System.out.println("Greatest Common Denominator (GCD) of " + FirstNumber + " and " + SecondNumber + " is " + GreatestCommonDenominator);
    System.out.println("Least Common Multiple (LCM) of " + FirstNumber + " and " + SecondNumber + " is " + LeastCommonMultiple);

  }
}