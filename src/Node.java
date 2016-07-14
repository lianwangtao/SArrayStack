/* 
 * SLinkedList
 * Author: Shane Lian
 * Class: Node
 */
public class Node<E> {
	//private fields
	private E data;
	private Node<E> next;
	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}
	
	//setters
	public void setData(E data) {
		this.data = data;
	}
	
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	//getters
	public E getData() {
		return this.data;
	}
	
	public Node<E> getNext() {
		return this.next;
	}
}
