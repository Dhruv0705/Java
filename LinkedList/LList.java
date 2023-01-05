// Dhruv Patel
// 9/28/2022
// Dr.Wagner
// Mini-Assignment #3 Linked List

// NOTE: Delete package when running
package LinkedList;


public class LList {
    
    // Keeps up with the head of the list
    public Node head;
    public Node tail;

    // Keeps up with the size of the list
    public int length;
    
    public Node next;
    

    public LList() {
        head = null;
        tail = null;
    }

    // Function to add to the end of a list
    public void add(int val) {

        // Creates a new Node holding the value entered and null
        Node newNode = new Node(val);

        // If Loops to check if head is empty
        if (head == null){

            // If head is empty then head and tail will be a new Node 
            head = newNode;
            tail = newNode;
        }

        // Else adds the value to the list
        else {
            
            // Needed for tail {addEnd}
            // As head is empty the new node will be added to the end of the list as tail next will move to the newNode
            tail.next = newNode;

            // tail new value will be added to newNode towards the end of the list or in this case tail.
            tail = newNode;
            
            // Node temp equal to head value to be used within the while loop value
            Node temp = head;

            // While temp value is not = to null
            while(temp.getNext() != null)

                // Get value of next number
                temp = temp.getNext();
            
            //Set new Node to the value
            temp.setNext(newNode);
        
          
        }

        // Finds the size of the list
        length++;
    }

    // Function to add new node to the middle of list
    public void addMiddle(int val) {

        // Creates a new Node holding the value entered and null
        Node newNode = new Node(val);

        // If Loops to see position of temp
        // Checks to see if head is empty
        if (head == null){
            head = newNode;
            tail = newNode;

        // Else enter the val given, finding the position, in the middle of the list  
        }
        else{

            // separator for current position within temp value and current value to be used within the for loop 
            Node temp, position;

            // Finds the middle position
            // Equation to find middle position was searched
            int count = (length % 2 == 0) ? (length/2) : ((length+1)/2);
            temp = head;
            position = null;

            // For loop to loop through to get to the middle of the list adn store the value
            for(int i= 0; i< count; i++) {
                position = temp;
                temp = temp.next;
            }

            // Sets the newNode value 
            position.next = newNode;
            newNode.next = temp; 
        }

        // Finds the size within the list
        length++;
    }

    // Function to add new node to the end of list when receiving a value
    public void addEnd(int val) {

        // Creates a new Node holding the value entered and null
        Node newNode = new Node(val);


        // Checks to see if head is empty
        if (head == null){

            // Then head and tail will equal to newNode value
            head = newNode;
            tail = newNode;
        }

        // Else value of newNode will be added to the end of the list (tail)
        else{
            tail.next = newNode;
            tail = newNode;
        }

        // Gets the size within the string
        // Not needed as the addMiddle was justified within add position
        length++;
    }
    
    //Function to display functions created 
    public String toString () {
        String values = "";
        if (head == null)
            return "Null";
        else {
            Node temp = head;
            while(temp != null){
                values += temp.getValue() + "\n";
                temp = temp.getNext();
            }   
        }
        return values;
    }
}
