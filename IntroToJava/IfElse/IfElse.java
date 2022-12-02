package IntroToJava.IfElse;
import java.util.Scanner;

public class IfElse {
    
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("tim")){
            System.out.println("You typed tim");
        }
        else if(s.equals("hello")){
            System.out.println("Hi!");
        }
        else if(s.equals("hi")){
            System.out.println("Hello!");
        }
        else{
            System.out.println("You typed " + s);
        }
        
    }
}
