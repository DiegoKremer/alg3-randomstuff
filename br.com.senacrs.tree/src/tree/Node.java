package tree;

public class Node<T> {
	
	private Node<T> children;
	private Node<T> parent;
	private Object value;
	private int key;
	
	public Node (Object v, int k) {
		this.value = v;
		this.key = k;
	}

}
