/*
 * Given a sorted array of integers, find the starting and ending position of a given target value. 
 * Your algorithm’s runtime complexity must be in the order of O(log n). 
 * If the target is not found in the array, return [-1, -1].
 */
public class SearchForARange {
	
	public static void main(String args[]){
		SearchForARange object = new SearchForARange();
		int array[]={5, 7, 7, 8, 8, 10};
		int range[]=new int[2];
		int value=8;
		range=object.search(array,range,value);
		System.out.println("The range of the value lies between " + range[0] + " and " + range[1]);
	}
	
	public int[] search(int array[],int range[],int value){
		if(array.length==0||array==null){
			range[0]=-1;
			range[1]=1;
			return range;
		}
			
		int low=0;
		int high=array.length-1;
		while(low<high){
			int mid=low+(high-low)/2;
			if(array[mid]<value)
				low=mid+1;
			else
				high=mid;
		}
		if(array[low]!=value){
			range[0]=-1;
			range[1]=1;
			return range;
		}
		range[0]=low;
		high=array.length-1;
		while(low<high){
			int mid=low+(high-low)/2 + 1;
			if(array[mid]>value)
				high=mid-1;
			else
				low=mid;
		}
		range[1]=high;		
		return range;
	}

}
