package leetcode;

public class MiddleOfLinkedList {

	public static void main(String[] args) {

		ListNode a = addValues(null, new ListNode(1));
		a = addValues(a, new ListNode(2));
		a = addValues(a, new ListNode(3));
		a = addValues(a, new ListNode(4));
		a = addValues(a, new ListNode(5));
		a = addValues(a, new ListNode(6));

		System.out.println(a);

		System.out.println(middleNode(a));
		
	}

	public static ListNode middleNode1(ListNode head) {
		ListNode[] nodes = new ListNode[100];
		int n = 0;
		ListNode curr_node = head;
		nodes[n] = curr_node;
		while (curr_node != null) {
			nodes[n] = curr_node;
			curr_node = curr_node.next;
			n++;
		}

		return nodes[n / 2];
	}

	public static ListNode middleNode(ListNode head) {
		ListNode slowNode = head;
		ListNode fastNode = head;
		while (fastNode != null && fastNode.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
		}

		return slowNode;
	}

	public static ListNode addValues(ListNode head, ListNode node) {

		ListNode curr = head;
		if (curr == null) {
			return node;
		}
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = node;

		return head;
	}

	static class ListNode {
		int val;

		ListNode next;

		ListNode(int a) {
			this.val = a;
		}

		@Override
		public String toString() {
			return "ListNode [val=" + val + ", next=" + next + "]";
		}

	}

}
