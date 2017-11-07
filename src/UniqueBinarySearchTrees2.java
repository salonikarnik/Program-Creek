package trees;

import java.util.*;

public class UniqueBinarySearchTrees2 {
	
	public static void main(String args[]) {
		UniqueBinarySearchTrees2 obj = new UniqueBinarySearchTrees2();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value for n: ");
		int n = in.nextInt();
		List<Treenode> list = obj.generate(n);
		System.out.println("Generated Trees = " + list.size());
		in.close();		
	}
	
	public List<Treenode> generate(int n){
		return gen(1,n);
	}
	
	private List<Treenode> gen(int start,int end){
		List<Treenode> result = new ArrayList<Treenode>();
		if(start>end) {
			result.add(null);
			return result;
		}
		
		List<Treenode> left,right;
		for(int i=start;i<=end;i++) {
			left = gen(start,i-1);
			right = gen(i+1,end);
			
			for(Treenode lnode:left) {
				for(Treenode rnode:right) {
					Treenode root = new Treenode(i);
					root.left=lnode;
					root.right=rnode;
					result.add(root);
				}
			}
		}
		return result;		
	}

}
