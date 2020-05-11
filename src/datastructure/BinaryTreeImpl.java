package datastructure;

public class BinaryTreeImpl {

	// Add node

	public static TreeNode addNode(TreeNode node, int val) {

		if (node == null) {
			return new TreeNode(val);
		}

		if (node.left == null) {
			node.left = addNode(node.left, val);
		} else if (node.right == null) {
			node.right = addNode(node.right, val);
		} else {
			node.left = addNode(node.left, val);
		}
		return node;
	}

	// get Node
	private static TreeNode getNode(TreeNode head, int val) {

		if (head == null) {
			return null;
		}

		if (head.value == val) {
			return head;
		}

		TreeNode node = null;

		if (head != null) {
			node = getNode(head.left, val);

			node = node != null ? node : getNode(head.right, val);
		}
		return node;

	}

	// remove node
	private static TreeNode removeNode(TreeNode head, int val) {

		// Get the node which child value matches the given value

		if (head == null || head.value == val) {
			return null;
		}
		if (head.left == null && head.right == null) {
			return head;
		}

		if (head.left != null ) {
			head.left = removeNode(head.left, val);
		} else if(head.right != null) {
			head.right = removeNode(head.right, val);
		} else {
			
		}

		if (head != null) {
			
			if (head.left == null) 
                return head.right; 
            else if (head.right == null) 
                return head.left;
			
			
			
		}

		return head;
	}

	private static TreeNode deepestVal(TreeNode node) {
		TreeNode value = node;

		if (node != null) {
			while (node.left != null) {
				value = node.left;
				node = node.left;
			}
		}

		return value;
	}

	// checkNode

	// inorder

	// pre order

	// post order

	// breath first

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode head = new TreeNode(10);

		head = addNode(head, 1);

		head = addNode(head, 2);
		head = addNode(head, 3);
		head = addNode(head, 4);
		// System.out.println(head);
		removeNode(head, 2);

		System.out.println(head);

	}

}
