package trees;

public class MinimumDepth{
	
	public static void main(String args[]) {
		Treenode root=new Treenode(1);
		root.left=new Treenode(2);
		root.left.left=new Treenode(3);
		root.left.right=new Treenode(4);
		root.right=new Treenode(5);
		MinimumDepth object = new MinimumDepth();
		System.out.println("Minimum depth of given binary tree is: " + object.findMin(root));
	}
	
	public int findMin(Treenode root) {
		if(root==null)
			return 0;
		return minDepth(root); 		
	}
	
	public int minDepth(Treenode root) {
		if(root==null)
			return 0;
		if(root.left!=null && root.right!=null)
			return 1 + Math.min(minDepth(root.left),minDepth(root.right));
		return 1 + Math.max(minDepth(root.left),minDepth(root.right));	
	}

}
