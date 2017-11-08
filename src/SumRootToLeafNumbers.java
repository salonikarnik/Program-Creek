package trees;

public class SumRootToLeafNumbers {
	
	public static void main(String args[]) {
		Treenode root=new Treenode(1);
		root.left=new Treenode(2);
		root.left.left=new Treenode(3);
		root.left.right=new Treenode(4);
		root.right=new Treenode(5);
		SumRootToLeafNumbers object = new SumRootToLeafNumbers();
		System.out.println("Sum of numbers from root to leaf is :- " + object.total(root,0));
	}
	
	public int total(Treenode root,int sum) {
		if(root==null)
			return 0;
		
		sum = sum*10 + root.data;
		
		if(root.left==null&root.right==null) {
			return sum;			
		}
		
		return total(root.left,sum) + total(root.right,sum);
		
		
	}

}
