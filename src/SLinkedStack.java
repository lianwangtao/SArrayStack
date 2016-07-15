
public class SLinkedStack<E> {
	
	//private field
	private Node<E> items;
	int numItems;
	
	/**
	 * Constructor
	 */
	public SLinkedStack() {
		items = new Node<E>(null,null);
		numItems = 0;
	}
	
	public void push(E item) {
		
	}
	
	public boolean isEmpty() {
		return (numItems == 0);
	}
	
	public int size() {
		return numItems;
	}
	
	public E pop() {
		return null;
	}

	
	
	public E peek() {
		return null;
	}
}
