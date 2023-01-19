package LinkedList2;

// Node2 class
public class Node2 {

	// Declare Private Variables
    private int value;
	private Node2 next;
	private Node2 prev;
	
	// Constructor for Node2
	public Node2 (int v) {

		// Set value to v
		value = v;

		// Set next and prev to null
		next = null;
		prev = null;
	}
	
	// Getters and Setters
	public int getValue() {
		return value;
	}
	
	public Node2 getNext() {
		return next;
	}
	
	public void setNext(Node2 n) {
		next = n;
	}
	
	public Node2 getPrev() {
		return prev;
	}
	
	public void setPrev(Node2 n) {
		prev = n;
	}
}

