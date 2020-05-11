package datastructure;

public class Node<T> {

	private T value;
	private Node<T> next;
	
	public Node(T value) {
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	@Override
	public String toString() {
		String nextValue = this.next != null ? (String) this.next.getValue().toString() : "Null";
		return "Node :: " + value + " --> " + nextValue;
	}

	

}
