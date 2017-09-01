package trees;

import java.util.*;

public class FlattenBinaryTreeToLinkedList {
	
	public static void main(String args[]){
		Treenode root=new Treenode(1);
		root.left=new Treenode(2);
		root.left.left=new Treenode(3);
		root.left.right=new Treenode(4);
		root.right=new Treenode(5);
		root.right.right=new Treenode(6);
		FlattenBinaryTreeToLinkedList obj = new FlattenBinaryTreeToLinkedList();
		obj.flatten(root);
	}
	
	public void flatten(Treenode root){
		LinkedList<Treenode> list = new LinkedList<>();
		System.out.println("After flattening of given binary tree to linked list :");
		list = preorder(root,list);
		Iterator<Treenode> iterator= list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next().data);
	}
	
	public LinkedList<Treenode> preorder(Treenode root,LinkedList<Treenode> list) {
		
		list.add(root);
		if(root==null)
			return list;
		if(root.left!=null)
			preorder(root.left,list);
		if(root.right!=null)
			preorder(root.right,list);
		return list;
		
		
	}

}
