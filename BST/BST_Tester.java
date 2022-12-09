import org.jfugue.player.Player;

public class BST_Tester {

	public static void main(String[] args) {
		BST mytree = new BST();
		Player musicPlayer = new Player();
		musicPlayer.play("C D E F G A B");
		mytree.insert(new BST_Node(32));
		mytree.insert(new BST_Node(13));
		mytree.insert(new BST_Node(4));
		mytree.insert(new BST_Node(18));
		mytree.insert(new BST_Node(8));
		mytree.insert(new BST_Node(75));
		System.out.println("PreOrder:");
		mytree.print(1);
		System.out.println("InOrder:");
		mytree.print(2);
		System.out.println("PostOrder:");
		mytree.print(3);
	}
}
