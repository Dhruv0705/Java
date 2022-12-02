// NOTE: Delete package when running
package LinkedList;

public class LLTester {
    
    public static void main(String[] args) {

        // Empty list
        LList myList = new LList();

        //Add value to the list
        myList.add(5);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(2);
        myList.add(0);

        // Inserts value to the middle of the list
        myList.addMiddle(8);
        myList.addMiddle(1);

        // Inserts value to the end of the list
        myList.addEnd(7);
        myList.addEnd(6);

        // Display Linked List
        System.out.println(myList.toString());
    }
}
