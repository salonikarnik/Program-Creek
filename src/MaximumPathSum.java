package trees;

public class MaximumPathSum {
	
	int max;
	
	public static void main(String args[]) {
		Treenode root = new Treenode(10);
		root.left = new Treenode(20);
		root.left.left=new Treenode(2);
		root.left.right=new Treenode(1);
		root.right = new Treenode(10);
		root.right.right =new Treenode(-25);
		root.right.right.left=new Treenode(3);
		root.right.right.right = new Treenode(4);
		MaximumPathSum obj = new MaximumPathSum();
		int sum = obj.maxSum(root);
		System.out.println("Maximum path sum in the given binary tree is : " + sum);		
	}
	
	public int maxSum(Treenode root) {
		max=Integer.MIN_VALUE;
		maxPathSum(root);
		return max;		
	}
	
	public int maxPathSum(Treenode root) {
		if(root==null)
			return 0;
		int left = Math.max(0,maxPathSum(root.left));
		int right = Math.max(0,maxPathSum(root.right));
		max=Math.max(max,left+root.data+right);
		return Math.max(left,right) + root.data;		
	}

}
