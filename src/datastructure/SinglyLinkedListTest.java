package datastructure;

public class SinglyLinkedListTest {

	public static void main3(String[] args) {

		// Initialize the singly linked list
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList(null);

		singlyLinkedList.printList(singlyLinkedList.getHead());

		Integer[] inputArr = { 1, 3, 5 };
		for (Integer i : inputArr) {
			singlyLinkedList.AddValueAtLast((new Node<Integer>(i)));
		}

		singlyLinkedList.printList(singlyLinkedList.getHead());

		// Add value at first
		// singlyLinkedList.AddValueAtFirst(new Node<Integer>(1));

		singlyLinkedList.printList(singlyLinkedList.getHead());

		// Add value at last
		// singlyLinkedList.AddValueAtLast(new Node<Integer>(12));

		singlyLinkedList.printList(singlyLinkedList.getHead());

		// reverse the linked list with iteration

		singlyLinkedList.reverListWithIteration(singlyLinkedList.getHead());

		singlyLinkedList.printList(singlyLinkedList.getHead());

		// reverse the linked list with recursive

		singlyLinkedList.reverListWithRecursion(singlyLinkedList.getHead());

		singlyLinkedList.printList(singlyLinkedList.getHead());

		// reverse the linked list with recursive

		System.out.println(singlyLinkedList.sumWithRecursion(singlyLinkedList.getHead()));

	}

	public static void main(String[] args) {
		SinglyLinkedList l1 = new SinglyLinkedList(null);

		SinglyLinkedList l2 = new SinglyLinkedList(null);

		Integer[] a = { 1, 5, 8 };

		Integer[] b = { 3, 5, 6 };

		for (int i : a) {
			l1.AddValueAtLast(new Node<Integer>(i));
		}

		for (int i : b) {
			l2.AddValueAtLast(new Node<Integer>(i));
		}

		SinglyLinkedList l3 = findSumOfTwoLinkedList(l1, l2);
		l3.reverListWithRecursion(l3.getHead());
		l3.printList(l3.getHead());
	}

	private static SinglyLinkedList findSumOfTwoLinkedList(SinglyLinkedList l1, SinglyLinkedList l2) {

		Node<Integer> result_head = new Node<Integer>(0);
		Node<Integer> result_node = result_head;

		int carry = 0;

		Node<Integer> l1_node = l1.getHead();
		Node<Integer> l2_node = l2.getHead();
		while (l1_node != null || l2_node != null) {

			l1_node = l1_node != null ? l1_node : new Node<Integer>(0);
			l2_node = l2_node != null ? l2_node : new Node<Integer>(0);

			int sum = l1_node.getValue() + l2_node.getValue();

			carry = sum / 10;
			Node<Integer> new_node = new Node<Integer>(sum % 10);

			result_node.setNext(new_node);

			l1_node = l1_node.getNext();
			l2_node = l2_node.getNext();
			result_node = result_node.getNext();

		}

		if (carry > 0) {
			Node<Integer> new_node = new Node<Integer>(carry);

			result_node.setNext(new_node);
			result_node = result_node.getNext();
		}

		return new SinglyLinkedList(result_head.getNext());
	}

	public static void main2(String[] args) {

		int a = 0;
		int b = 1;

		printFib(4);
	}

	private static int printFib(int n) {
		if (n == 0) {
			return n;
		}
		int sum = 0;

		System.out.println(1 + printFib(n - 1));

		return sum;
	}

}
