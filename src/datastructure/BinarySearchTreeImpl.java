package datastructure;

import java.util.Queue;
import java.util.LinkedList;

public class BinarySearchTreeImpl {

	public static TreeNode addNode(TreeNode head, int val) {

		if (head == null) {
			return new TreeNode(val);
		}

		if (head.value >= val) {
			head.left = addNode(head.left, val);
		} else {
			head.right = addNode(head.right, val);
		}

		return head;
	}

	public static TreeNode getNode(TreeNode head, int val) {

		if (head == null || head.value == val) {
			return head;
		}

		if (head.value >= val) {
			head = getNode(head.left, val);
		} else {
			head = getNode(head.right, val);
		}

		return head;

	}

	public static boolean isNodePresent(TreeNode head, int val) {

		if (head == null) {
			return false;
		}
		if (head.value == val) {
			return true;
		}

		if (head.value >= val) {
			return isNodePresent(head.left, val);
		} else {
			return isNodePresent(head.right, val);
		}

	}

	public static TreeNode removeNode(TreeNode head, int val) {
		if (head == null) {
			return null;
		}

		if (head.value > val) {
			head.left = removeNode(head.left, val);
		} else if (head.value < val) {
			head.right = removeNode(head.right, val);
		} else {

			if (head.left == null) {
				return head.right;
			} else if (head.right == null) {
				return head.left;
			}

			head.value = minDeepVal(head.right);
			head.right = removeNode(head.right, head.value);

		}

		return head;
	}

	private static Integer minDeepVal(TreeNode right) {
		TreeNode node = right;
		Integer value = right.value;

		while (node.left != null) {
			value = node.left.value;
			node = node.left;
		}
		return value;
	}

	public static void inOrderTraversal(TreeNode head) {

		if (head == null) {
			return;
		}

		inOrderTraversal(head.left);
		System.out.print(head.value + " ");
		inOrderTraversal(head.right);
	}

	public static void preOrderTraversal(TreeNode head) {

		if (head == null) {
			return;
		}

		System.out.print(head.value + " ");
		preOrderTraversal(head.left);
		preOrderTraversal(head.right);
	}

	public static void postOrderTraversal(TreeNode head) {

		if (head == null) {
			return;
		}

		postOrderTraversal(head.left);
		postOrderTraversal(head.right);
		System.out.print(head.value + " ");
	}

	public static void breathFirst(TreeNode head) {

		Queue<TreeNode> pipe = new LinkedList<>();
		pipe.add(head);
		while (pipe.size() > 0) {
			TreeNode node = pipe.poll();
			System.out.print(node.value + " ");
			if (node.left != null) {
				pipe.add(node.left);
			}
			if (node.right != null) {
				pipe.add(node.right);
			}
		}
	}

	public static void main(String[] args) {

		TreeNode head = new TreeNode(10);

		// Add Node
		addNode(head, 6);
		addNode(head, 15);
		addNode(head, 5);
		addNode(head, 8);
		addNode(head, 13);
		addNode(head, 19);
		addNode(head, 12);
		addNode(head, 14);

		inOrderTraversal(head);
		System.out.println();

		System.out.println(head);

		System.out.println(getNode(head, 3));

		System.out.println(isNodePresent(head, 3));

		System.out.println(isNodePresent(head, 31));
		
		System.out.println("breath first to find the insertion oder ");
		breathFirst(head);
		
		System.out.println();

		System.out.println(removeNode(head, 50));

		System.out.println(removeNode(head, 10));

		System.out.println(removeNode(head, 12));

		System.out.println("in order");
		inOrderTraversal(head);

		System.out.println("pre order");
		preOrderTraversal(head);
		System.out.println("post order");
		postOrderTraversal(head);

		System.out.println("breath first");
		breathFirst(head);

	}

}
