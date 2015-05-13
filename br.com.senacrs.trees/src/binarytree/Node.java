package binarytree;

public class Node {
	
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
	
	public void insert (Node newNode) {
		if(newNode.data < this.data) {
			insertLeft(newNode);
		} else if (newNode.data > this.data) {
			insertRight (newNode);
		}
		
	}

	private void insertRight(Node newNode) {
		if (rightChild == null) {
			rightChild = newNode;
		} else {
			rightChild.insert(newNode);
		}
		
	}

	private void insertLeft(Node newNode) {
		if (leftChild == null) {
			leftChild = newNode;
		} else {
			leftChild.insert(newNode);
		}
		
	}

}
