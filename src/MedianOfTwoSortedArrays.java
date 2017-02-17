/*
 * There are two sorted arrays A and B of size m and n respectively. 
 * Find the median of the two sorted arrays. 
 * The overall run time complexity should be O(log (m+n)).
 */
public class MedianOfTwoSortedArrays{	
	public static void main(String args[]){
		int a[]={1,9};
		int b[]={2,3,4};
		MedianOfTwoSortedArrays obj=new MedianOfTwoSortedArrays();
		System.out.println("The median of the two sorted arrays is: " + obj.findMedian(a,b));
	}	
	public double findMedian(int a[],int b[]){
		int m=a.length;
		int n=b.length;
		int k=m+n;
		if(k%2!=0)
			return findK(a,0,m,b,0,n,(k+1)/2);
		else{
			return (findK(a,0,m,b,0,n,k/2) + findK(a,0,m,b,0,n,k/2+1))/2.0;
		}
	}	
	public int findK(int a[],int aBegin,int m,int b[],int bBegin,int n,int k){
		if(m>n)
			return findK(b,bBegin,n,a,aBegin,m,k);
		if(k==1)
			return Math.min(a[aBegin],b[bBegin]);
		if(m==0)
			return b[bBegin+k-1];
		if(n==0)
			return a[aBegin+k-1];
		int midA=Math.min(k/2,m);
		int midB=k-midA;
		if(a[aBegin+midA-1]==b[bBegin+midB-1])
			return a[aBegin+midA-1];
		else if(a[aBegin+midA-1]>b[bBegin+midB-1])
			return findK(a,aBegin,m,b,bBegin+midB,n-midB,k-midB);
		else
			return findK(a,aBegin+midA,m-midA,b,bBegin,n,k-midA);		
	}
}
