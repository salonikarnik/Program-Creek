package trees;

import java.util.*;

public class MaximumDepthOfBinaryTree {
	
	public static void main(String args[]) {
		Treenode root=new Treenode(1);
		root.left=new Treenode(2);
		root.left.left=new Treenode(3);
		root.left.right=new Treenode(4);
		root.right=new Treenode(5);
		MaximumDepthOfBinaryTree object = new MaximumDepthOfBinaryTree();
		System.out.println("Maximum depth of given binary tree is: " + object.findMax(root));
		System.out.println("Maximum depth of given binary tree is: " + object.findMaxIteratively(root));
	}
	
	public int findMax(Treenode root) {
		if(root==null)
			return 0;		
		int left = findMax(root.left);
		int right = findMax(root.right);
		return Math.max(left, right) + 1;		
	}
	
	//BFS
	public int findMaxIteratively(Treenode root) {
		int max=0;
		Queue<Treenode> queue = new LinkedList<Treenode>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			while(size-- > 0) {
				Treenode poll = queue.poll();
				if(poll.left!=null) {
					queue.offer(poll.left);
				}
				if(poll.right!=null) {
					queue.offer(poll.right);
				}
			}
			max++;
		}
		return max;
	}
}
