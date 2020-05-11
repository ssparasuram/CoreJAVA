package leetcode;

import java.io.ObjectInputStream.GetField;

import datastructure.BinaryTreeImpl;
import datastructure.TreeNode;

public class DiameterOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// diameter of tree
		// max(lenth via root, max(left node length, right node length)

		// diameter = left height + right+1

		TreeNode head = new TreeNode(10);

		BinaryTreeImpl bt = new BinaryTreeImpl();

		head = bt.addNode(head, 1);

		head = bt.addNode(head, 2);
		head = bt.addNode(head, 3);
		head = bt.addNode(head, 4);

		System.out.println(diameterOfBinaryTree(head));

	}

	public static int diameterOfBinaryTree(TreeNode root) {

		if (root == null) {
			return 0;
		}

		int lheight = height(root.left);
		int rheight = height(root.right);

		int ldiameter = diameterOfBinaryTree(root.left);
		int rdiamter = diameterOfBinaryTree(root.right);

		return Math.max((lheight + rheight), Math.max(ldiameter, rdiamter));

	}

	public static int height(TreeNode root) {
		// max of height of left or right leaf +1

		if (root == null) {
			return 0;
		}

		int left = height(root.left);
		int right = height(root.right);

		return (1 + Math.max(left, right));
	}

}
