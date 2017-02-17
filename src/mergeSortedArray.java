/*
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * Note: You may assume that A has enough space to hold additional elements from B.
 * The number of elements initialized in A and B are m and n respectively.
 */
import java.io.*;
public class mergeSortedArray {
	
	public static void main(String args[])throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the array A size value : m = ");
		int m=Integer.parseInt(br.readLine());
		System.out.print("\n Enter the array B size value : n = ");
		int n=Integer.parseInt(br.readLine());
		
		int a[]=new int[m+n];
		int b[]=new int[n];
		
		for(int i=0;i<n;i++){
			System.out.println("Enter a number");
			b[i]=Integer.parseInt(br.readLine());
		}
		
		for(int j=0;j<m;j++){
			System.out.println("Enter a number");
			a[j]=Integer.parseInt(br.readLine());
		}
		
		mergeSortedArray object = new mergeSortedArray();
		object.mergeArrays(a,m,b,n);
	}
	
	public void mergeArrays(int a[],int m,int b[],int n){
		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		
		while(k>0){
			if(a[i]>b[j])
				a[k--]=a[i--];
			else
				a[k--]=b[j--];
		}
		
		while(j>0){
			a[k--]=b[j--];
		}
		
		System.out.println("\nMerged Sorted Array:");
		for(int p=0;p<m+n;p++){
			System.out.print("\t" + a[p]);
		}
	}

}
