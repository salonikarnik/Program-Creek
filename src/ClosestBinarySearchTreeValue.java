package trees;

public class ClosestBinarySearchTreeValue {
	
	public static void main(String args[]) {
		Treenode root=new Treenode(5);
		root.left=new Treenode(3);
		root.right=new Treenode(7);
		root.left.left=new Treenode(2);
		root.left.right=new Treenode(4);
		root.right.left=new Treenode(6);
		root.right.right=new Treenode(8);
		ClosestBinarySearchTreeValue obj = new ClosestBinarySearchTreeValue();
		int answer1 = obj.closest(root,10);
		int answer2 = obj.closest(root,1);
		System.out.print("Value closest to 10 in the BST is = " + answer1);
		System.out.print("\nValue closest to 1 in the BST is = " + answer2);
	}
	
	public int closest(Treenode root,int target) {	
		int result = root.data;
		while(root!=null) {
			if(Math.abs(target-root.data)<Math.abs(target-result))
				result = root.data;
			root=root.data>target?root.left:root.right;
		}
		return result;
	}

}
