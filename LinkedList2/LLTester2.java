package LinkedList2;

public class LLTester2 {
    public static void main(String[] args) {

        // Empty list
        LList2 myList = new LList2();

        //Add value to the list
        myList.add(5);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(2);
        myList.add(0);

        // Inserts value to the middle of the list
        myList.insert(3, 8);
        myList.insert(1, 1);

        // Inserts value to the end of the list
        myList.remove(7);
        myList.remove(6);

        // Display Linked List
        System.out.println(myList.toString());
    }
}