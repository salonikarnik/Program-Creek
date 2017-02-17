/*
 * Given a sorted array and a target value, return the index if the target is found. 
 * If not,return the index where it would be if it were inserted in order. 
 * You may assume no duplicates in the array.
 */
public class SearchInsertPosition {
 
	public static void main(String args[]){
		int array[]={1,3,5,6};
		SearchInsertPosition obj = new SearchInsertPosition();
		System.out.println("Index for value 5 in the array is: " + obj.findTarget(array,5));
		System.out.println("Index for value 2 in the array is: " + obj.findTarget(array,2));
		System.out.println("Index for value 7 in the array is: " + obj.findTarget(array,7));
		System.out.println("Index for value 0 in the array is: " + obj.findTarget(array,0));
		
	}	
	
	public int findTarget(int array[],int value){
		int low=0;
		int high=array.length;
		while(low<high){
			int mid=low+(high-low)/2;
			if(array[mid]<value)
				low=mid+1;
			else
				high=mid;				
		}		
		return low;
	}
}
