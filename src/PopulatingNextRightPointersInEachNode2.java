package trees;

public class PopulatingNextRightPointersInEachNode2 {
	
	public static void main(String args[]) {
		TreeNodes root = new TreeNodes(6);
		root.left = new TreeNodes(4);
		root.right = new TreeNodes(8);
		root.left.left = new TreeNodes(3);
		root.right.left = new TreeNodes(7);
				
		PopulatingNextRightPointersInEachNode2 obj = new PopulatingNextRightPointersInEachNode2();
		obj.populate(root);
	}
	
	public void populate(TreeNodes root) {
		TreeNodes dummy = new TreeNodes(0);
		TreeNodes pre = dummy;
		while(root!=null) {
			if(root.left!=null) {
				pre.next = root.left;
				pre=pre.next;
			}
			if(root.right!=null) {
				pre.next = root.right;
				pre=pre.next;
			}
			root=root.next;
			if(root==null) {
				pre = dummy;
				root = dummy.next;
				dummy.next=null;
			}
		}
	}

}
