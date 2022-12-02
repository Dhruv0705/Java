package LinkedList2;

public class LList2 {
	
	//keeps up with the head of the list
	private Node2 head;
	private Node2 tail;
	
	public LList2() {
		head = null;
		tail = head;
	}
	
	//adds to the end of the list
	public void add(int val) {
		Node2 newNode = new Node2(val);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.setPrev(tail);
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	//inserts at specified position
	public void insert(int position, int val) {
		Node2 newNode = new Node2(val);
		if(position == 0) {
			//add to front of list
			newNode.setNext(head);
			head.setPrev(newNode);
			head = newNode;
		}
		else {
			Node2 temp = head;
			int counter = 0;
			while(temp.getNext() != null && counter<position) {
				temp = temp.getNext();
				counter++;
			}
			if(temp.getNext() == null && counter<position) {
				System.out.println("Out of bounds");
			}
			else {
				//temp is the previous node
				Node2 predecessor = temp.getPrev();
				newNode.setNext(temp);
				newNode.setPrev(predecessor);
				temp.setPrev(newNode);
				predecessor.setNext(newNode);
			}
		}
	}
	
	//removes at specified position
	public int remove(int position) {
		if(position == 0) 
			return removeBeginning();
		else {
			Node2 temp = head;
			int counter = 0;
			while(temp.getNext() != null && counter<position) {
				temp = temp.getNext();
				counter++;
			}
			if(temp.getNext() == null && counter<position) {
				System.out.println("Out of bounds");
				return -1;
			}
			else if(temp.getNext() == null)
				return remove();
			else {
				//temp is the previous node
				int value = temp.getValue();
				Node2 predecessor = temp.getPrev();
				Node2 successor = temp.getNext();
				predecessor.setNext(successor);
				successor.setPrev(predecessor);
				return value;
			}
		}
	}
	//removes the last element
	public int remove() {
		Node2 previous = tail.getPrev();
		int value = tail.getValue();
		previous.setNext(null);
		tail = previous;
		return value;
	}
	
	public int removeBeginning() {
		int value = head.getValue();
		head = head.getNext();
		head.setPrev(null);
		return value;
	}
	
	public String toString() {
		String values = "";
		if(head == null)
			return "Null";
		else {
			Node2 temp = head;
			while(temp != null) {
				values += temp.getValue() + "\n";
				temp = temp.getNext();
			}
		}
		return values;
	}
}

