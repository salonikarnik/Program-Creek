package trees;

public class SymmetricTree {
	
	public static void main(String args[]) {
		Treenode root=new Treenode(1);
		root.left=new Treenode(2);
		root.left.left=new Treenode(3);
		root.left.right=new Treenode(4);
		root.right=new Treenode(2);
		root.right.left = new Treenode(4);
		root.right.right=new Treenode(3);
		SymmetricTree object = new SymmetricTree();
		System.out.println("Is the given Binary Tree symmetric? " + object.check(root));
	}
	
	public boolean check(Treenode root) {
		if(root==null)
			return false;
		return isSymmetric(root.left,root.right);		
	}
	
	public boolean isSymmetric(Treenode left,Treenode right) {
		if(left==null&&right==null)
			return true;
		if(left==null||right==null||left.data!=right.data)
			return false;
		return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
	}

}
