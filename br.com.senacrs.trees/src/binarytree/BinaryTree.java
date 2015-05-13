package binarytree;

public class BinaryTree {
	
	
	private Node root = null;
	
	
	public boolean isEmpty () {
		
		return root == null;
		
	}
	
	public void insert (Node newNode) {
		
		
		if (isEmpty()) {
			
			root = newNode;
			
		} else {
			
			root.insert(newNode);
			
		}
				
		
	}

}
