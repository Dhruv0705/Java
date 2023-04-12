package IntroToJava.ConditionsNBoolean;


public class ConditionNBoolean {
    
    public static void main(String []  args) {

        int x = 6;
        int y = 7;
        int z = 10;

        String x1 = "hello";
        String y1 = "hi";

        // > < == >= <= !=
        boolean compareint = x != y;
        boolean comparestr = x1 == y1; 

        // Multiple Conditions
        // || - OR
        // && - AND

        // OR Condition - If one is true will be true of both is false is false. 
        boolean compareor = x > y || z < y;

        // AND Condition - If both conditions is true is true or if one or both is false will be false
        boolean compareand = x > y && z < y;

        // Reverse boolean
        boolean comparenot = !(x>y || z < y);

        // Compare to
        x1.equals("hi");


        System.out.println(compareint);
        System.out.println(comparestr);
        System.out.println(compareor);
        System.out.println(compareand);
        System.out.println(comparenot);
        System.out.println(x1);


        

    }
}
