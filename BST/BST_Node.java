
public class BST_Node {

	private int value;
	private BST_Node leftChild;
	private BST_Node rightChild;
	
	public BST_Node(int value) {
		this.value = value;
		leftChild = null;
		rightChild = null;
	}
	
	//Getters and Setters
	public void setLeftChild(BST_Node lc) {
		leftChild = lc;
	}
	
	public BST_Node getLeftChild() {
		return leftChild;
	}

	public void setRightChild(BST_Node lc){
		rightChild = lc;
	}

	public BST_Node getRightChild(){
		return rightChild;
	}
	public int getValue() {
		return value;
	}
}
