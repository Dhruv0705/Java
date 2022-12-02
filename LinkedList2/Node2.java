package LinkedList2;

public class Node2 {
    private int value;
	private Node2 next;
	private Node2 prev;
	
	public Node2 (int v) {
		value = v;
		next = null;
		prev = null;
	}
	
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

