package trees;

public class PopulatingNextRightPointersInEachNode {
	
	public static void main(String args[]) {
		TreeNodes root = new TreeNodes(6);
		root.left = new TreeNodes(4);
		root.right = new TreeNodes(8);
		root.left.left = new TreeNodes(3);
		root.left.right = new TreeNodes(5);
		root.right.left = new TreeNodes(7);
		root.right.right = new TreeNodes(9);		
		PopulatingNextRightPointersInEachNode obj = new PopulatingNextRightPointersInEachNode();
		obj.populate(root);
	}
	
	public void populate(TreeNodes root){
		
		while(root!=null&&root.left!=null) {
			TreeNodes next = root.left;
			while(root!=null) {
				root.left.next = root.right;
				root.right.next = root.next==null?null:root.next.left;
				root=root.next;
			}
			root=next;
		}		
	}
}

class TreeNodes{
	TreeNodes left;
	TreeNodes right;
	TreeNodes next;
	int value;
	
	public TreeNodes(int value) {
		this.next=null;
		this.value=value;
	}
}
