// NOTE: Delete package when running
package LinkedList;

// Node class
public class Node {
    
	// Declare variables
    public int value;
	protected Node next;
	public Node prev;
	
	// Constructor for Node
	public Node (int v) {

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
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	public Node getPrev() {
		return prev;
	}
	
	public void setPrev(Node n) {
		prev = n;
	}
}
