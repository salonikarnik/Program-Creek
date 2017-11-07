package trees;

import java.util.*;
import java.io.*;

public class UniqueBinarySearchTrees{
	
	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value for n : ");
		int n = Integer.parseInt(in.nextLine());
		in.close();
		UniqueBinarySearchTrees obj = new UniqueBinarySearchTrees();
		System.out.println("Number of unique BSTs that can be generated are : " + obj.number(n));
	}
	
	private int number(int n) {
		int g[] = new int[n+1];
		g[0] = 1;
		g[1] = 1;
		
		for(int i = 2;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				g[i] += g[j-1]*g[i-j];
			}
		}
		return g[n];
	}
}
