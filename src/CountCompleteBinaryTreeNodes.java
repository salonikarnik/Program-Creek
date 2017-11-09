package trees;

public class CountCompleteBinaryTreeNodes {
	
	public static void main(String args[]) {
		Treenode root=new Treenode(1);
		root.left=new Treenode(2);
		root.right=new Treenode(3);
		root.left.left=new Treenode(4);
		root.left.right=new Treenode(5);
		CountCompleteBinaryTreeNodes object = new CountCompleteBinaryTreeNodes();
		System.out.print("Number of nodes = " + object.countNodes(root));
	}
	
	public int countNodes(Treenode root) {
		int leftCount = leftHeight(root);
		int rightCount = rightHeight(root);
		if(leftCount==rightCount)
			return (1<<leftCount) - 1;
		else
			return 1+countNodes(root.left)+countNodes(root.right);
	}
	
	public int leftHeight(Treenode root) {
		int countLeft=0;
		while(root!=null) {
			root=root.left;
			countLeft++;			
		}
		return countLeft;
	}
	
	public int rightHeight(Treenode root) {
		int countRight=0;
		while(root!=null) {
			root=root.right;
			countRight++;
		}
		return countRight;
	}
}
