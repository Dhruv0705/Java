package IntroToJava.IfElse;
import java.util.Scanner;

public class IfElse {
    
    // If Else
    public static void main(String [] args){

        // Ask the user for their age
        try (Scanner sc = new Scanner(System.in)) {

            // Ask the user for their age
            String s = sc.nextLine();

            // If the user inputted tim
            if (s.equals("tim")){

                // Print "You typed tim"
                System.out.println("You typed tim");
            }
            
            // else if the user typed hello
            else if(s.equals("hello")){

                // Print "Hi!"
                System.out.println("Hi!");
            }

            // else if the user typed hi
            else if(s.equals("hi")){

                // Print "Hello!"
                System.out.println("Hello!");
            }

            // else
            else{

                // Print "You typed __" 
                System.out.println("You typed " + s);
            }
        }
    }
}
