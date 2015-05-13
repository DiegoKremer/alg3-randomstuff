package binarytree;

public class BinaryTree {
	
	public class Node 
	{
		Node leftChild;
		Node rightChild;
		Node parent;
		int data;
		
		public Node () {
			
		}
		
		public Node (int data) {
			
			this.data = data;
			
		}
		
		public Node (int data, Node parent) {
			
			this.data = data;
			this.parent = parent;
			
		}

	}
	
	private Node root = null;
	
	
	public boolean isEmpty () {
		
		return root == null;
		
	}
	
	public void insert (int data) {
		
		Node newNode = new Node (data);
		
		if (isEmpty()) {
			
			root = newNode;
			
		}
		
		
		
		if (newNode.data > root.data) {
			
			root.rightChild = newNode;
			
		} else {
			
			root.leftChild = newNode;
			
		}
		
		
	}

}
