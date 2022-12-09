
import jm.JMC;
import jm.music.data.*;
import jm.util.*;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class BST {

	private BST_Node root;
	private Player music;
	
	//Constructor
	public BST() {
		root = null;
	}

	
	public void insert(BST_Node node) {

		//method inserts an node into the tree
		//tree is null
		if(root == null) {
			root = node;
			root.setLeftChild(null);
			root.setRightChild(null);
		}

		//tree has values
		else {
			BST_Node current = root;
			while(current != null) {
				if(node.getValue() == current.getValue())
					current = null;
				if(node.getValue() < current.getValue()) {
					if(current.getLeftChild() == null) {
						current.setLeftChild(node);
						current = null;
					}
					else
						current = current.getLeftChild();
				}
				else {
					if(current.getRightChild() == null) {
						current.setRightChild(node);
						current = null;
					}
					else
						current = current.getRightChild();
				}
			}
		}
	}
	
	// Pre-Order Traversal
	public static void printPreOrder(BST_Node node) {

		// If node value is not equal to anything return to the next class else continue if node is holding a value
		if(node == null)
			return;
			
		// Traversal Prints the very first node
		System.out.println(node.getValue());

		// Then prints the left sub-tree node
		printPreOrder(node.getLeftChild());

		// Then prints the right sub-tree node
		printPreOrder(node.getRightChild());
		
	}
	
	
	// Post-orrder Traversal
	public static void printInOrder(BST_Node node) {

		// If node value is not equal to anything return to the next class else continue if node is holding a value
		if(node == null)
			return;
			
		// First prints all of the left sub-tree node
		printPreOrder(node.getLeftChild());

		// Traversal Prints the very first node
		System.out.println(node.getValue());

		// Then prints the right sub-tree node
		printPreOrder(node.getRightChild());		
	
	}
	// In-Rrder Traversal
	public static void printPostOrder(BST_Node node) {

		// If node value is not equal to anything return to the next class else continue if node is holding a value
		if(node == null)
			return;
			
		// First prints all of the left sub-tree node
		printPreOrder(node.getLeftChild());

		// Then prints the right sub-tree node
		printPreOrder(node.getRightChild());

		// Then prints the very first node last
		System.out.println(node.getValue());
	}

	public void print(int order) {
		if(order == 1) //pre-order
			printPreOrder(root);
		else if(order == 2) //in-order
			printInOrder(root);
		else //post-order
			printPostOrder(root);
	}
	
	public BST_Node search(int value) {
		BST_Node current = root;
		while(current != null) {
			if(current.getValue() == value)
				return current;
			else if(value < current.getValue())
				current = current.getLeftChild();
			else
				current = current.getRightChild();
		}
		return null; //not found
	}
	
	public static void Player(int order) {
		Player player = new Player();
		if (order == 1)
			player.play("C D E F G A B");
		else if (order ==2)
			player.play(" ");
		else if (order ==3)
			player.play(" ");
	}
	
	   
}





