package binarytree;

public class Main {

	public static void main(String[] args) {
		
		BinaryTree btree = new BinaryTree ();
		Node Node2 = new Node (2);
		Node Node7 = new Node (7);
		Node Node8 = new Node (8);
		Node Node14 = new Node (14);
		btree.insert(Node2);
		btree.insert(Node14);
		btree.insert(Node8);
		btree.insert(Node7);
		
		System.out.println();

	}

}
