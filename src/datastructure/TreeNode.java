package datastructure;

public class TreeNode {
	
	Integer value;
	public TreeNode left, right;
	
	TreeNode(){
		this.value = null;
		this.left = null;
		this.right = null;
	}
	
	public TreeNode(int v){
		this.value = v;
		this.left = null;
		this.right = null;
	}

	@Override
	public String toString() {
		
		
		return "TreeNode [value=" + value + ", left=" + left + ", right=" + right + "]";
	}
	

}
