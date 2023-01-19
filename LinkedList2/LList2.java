package LinkedList2;

public class LList2 {

    // Keeps track of the head node of the linked list
    private Node2 head;

    // Keeps track of the tail node of the linked list
    private Node2 tail;
    
    // Default constructor to initialize the head and tail to null
    public LList2() {
        head = null;
        tail = head;
    }
    
    // Method to add a new node with a given value to the end of the linked list
    public void add(int val) {

        Node2 newNode = new Node2(val);

        // If the linked list is empty, set the head and tail to the new node
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {

            // Update the tail node's next reference to point to the new node
            tail.setNext(newNode);

            // Update the new node's previous reference to point to the tail node
            newNode.setPrev(tail);

            // Set the tail to the new node
            tail = newNode;
        }
    }
    
    // Method to insert a new node with a given value at a specified position in the linked list
    public void insert(int position, int val) {

        Node2 newNode = new Node2(val);

        if (position == 0) {

            // If the position is at the start of the linked list, add the new node to the front of the linked list
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        } else {
            Node2 temp = head;
            int counter = 0;

            // Traverse the linked list to the specified position
            while (temp.getNext() != null && counter < position) {
                temp = temp.getNext();
                counter++;
            }
            if (temp.getNext() == null && counter < position) {
				
                // If the specified position is greater than the size of the linked list, print an error message
                System.out.println("Out of bounds");
            } else {

                // If the specified position is within the bounds of the linked list, insert the new node at that position
                Node2 predecessor = temp.getPrev();
                newNode.setNext(temp);
                newNode.setPrev(predecessor);
                temp.setPrev(newNode);
                predecessor.setNext(newNode);
            }
        }
    }

	//removes the last element
	public int remove(int i) {

		// Set the tail to the previous node
		Node2 previous = tail.getPrev();

		// Get the value of the tail node
		int value = tail.getValue();

		// Set the next reference of the previous node to null
		previous.setNext(null);

		// Set the tail to the previous node
		tail = previous;

		// Return the value of the removed node
		return value;
	}
	
	// removes the first element
	public int removeBeginning() {

		// Get the value of the head node
		int value = head.getValue();

		// Set the head to the next node
		head = head.getNext();

		// Set the previous reference of the new head to null
		head.setPrev(null);

		// Return the value of the removed node
		return value;
	}
	
	// removes the element at the specified position
	public String toString() {

		// Declare a string to store the values of the linked list
		String values = "";

		// If the linked list is empty, return null
		if(head == null)
			return "Null";

		// If the linked list is not empty, traverse the linked list and add the values to the string
		else {
			
			// Set the temp node to the head
			Node2 temp = head;

			// Traverse the linked list and add the values to the string
			while(temp != null) {
				values += temp.getValue() + "\n";
				temp = temp.getNext();
			}
		}

		// Return the string
		return values;
	}
}

