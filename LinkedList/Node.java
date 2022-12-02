// NOTE: Delete package when running
package LinkedList;
    
public class Node {
        
    public int value;
	protected Node next;
	public Node prev;
	
	public Node (int v) {
		value = v;
		next = null;
		prev = null;
	}
	
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
