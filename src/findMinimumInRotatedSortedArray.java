/*
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand. (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * Find the minimum element.
 * You may assume no duplicate exists in the array.
 */
public class findMinimumInRotatedSortedArray {
	
	public static void main(String args[]){
		int array[]={4,5,6,7,1,2,3};
		findMinimumInRotatedSortedArray object = new findMinimumInRotatedSortedArray();
		System.out.println("The minimum element in the given rotated array is : " + object.findMin(array));
	}
	
	public int findMin(int array[]){
		
		int low=0,high=array.length-1;
		while(low<high){
			int mid=low+(high-low)/2;
			if(array[mid]>array[high])
				low=mid+1;
			else
				high=mid;
		}
		
		return array[low];
	}

}
