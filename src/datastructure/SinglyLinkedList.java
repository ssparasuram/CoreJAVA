package datastructure;

public class SinglyLinkedList {

	private  Node<Integer> head;
	

	public SinglyLinkedList(Node<Integer> node) {
		this.head = node;
	}

	public Node<Integer> getHead() {
		return head;
	}

	public void setHead(Node<Integer> head) {
		this.head = head;
	}

	public Node<Integer> AddValueAtLast(Node<Integer> node) {

		Node<Integer> currentHead = this.head;

		if (this.head == null) {
			this.head = node;
			return this.head;
		}

		while (currentHead.getNext() != null) {
			currentHead = (Node<Integer>) currentHead.getNext();
		}

		currentHead.setNext(node);

		return head;
	}
	
	public Node<Integer> AddValueAtFirst(Node<Integer> node) {
		if (this.head == null) {
			this.head = node;
			return this.head;
		} else {
			node.setNext(this.head);
			this.head = node;
		}
		return head;
	}
	
	public void printList(Node<Integer> node) {
		Node<Integer> currentNode = node;
		StringBuilder sb = new StringBuilder();
		
		while(currentNode != null ) {
			sb.append(currentNode.getValue() + "-->");
			currentNode = currentNode.getNext();
		}
		
		if(sb.length() > 3) {
			System.out.println(sb.substring(0, sb.length()-3));
		} else {
			System.out.println("Empty");
		}
	}
	
	
	public Node<Integer> reverListWithIteration(Node<Integer> node){
		Node<Integer> nextNode= null;
		Node<Integer> prevNode = null;
		Node<Integer> currNode = node;
		
		while(currNode.getNext() != null) {
			nextNode = currNode.getNext();
			currNode.setNext(prevNode);
			prevNode = currNode;
			currNode = nextNode;
		}
		this.head = currNode;
		this.head.setNext(prevNode);
		return currNode;
	}
	
	private Node<Integer> reverListWithRecursion1(Node<Integer> node) {
		
		//System.out.println(node.toString());
		if(node.getNext() == null) {
			return node;
		}
		System.out.println(node.toString());
		
		Node<Integer> newNode = reverListWithRecursion1(node.getNext());
		//System.out.println(newNode.toString());
		node.getNext().setNext(node);
		node.setNext(null);
		
		printList(newNode);
		return newNode;
	}
	
	public Integer sumWithRecursion(Node<Integer> node) {
		
		//System.out.println(node.toString());
		if(node.getNext() == null) {
			int value =  node.getValue();
			//node = node.getNext();
			return value;
		} else {
			return node.getValue()+sumWithRecursion(node.getNext());
		}
	}
	
	public Node<Integer> reverListWithRecursion(Node<Integer> node) {
		this.head =  reverListWithRecursion1(node);
		return this.head;
	}
	
	public Integer sumWithRecursion1(Node<Integer> node) {
		return sumWithRecursion(node);
		
	}

}
