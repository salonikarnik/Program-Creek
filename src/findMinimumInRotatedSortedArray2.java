
public class findMinimumInRotatedSortedArray2 {
	
	public static void main(String args[]){
		int array[]={4,5,6,7,1,2,3};
		findMinimumInRotatedSortedArray2 object = new findMinimumInRotatedSortedArray2();
		System.out.println("The minimum element in the given rotated array is : " + object.findMin(array));
	}
	
	public int findMin(int array[]){
		int low=0;
		int high=array.length-1;
		while(low<high){
			int mid=low+(high-low)/2;
			if(array[mid]>array[high])
				low=mid+1;
			else if(array[mid]<array[high])
				high=mid;
			else
				high--;   //mid==high,ignore duplicate value
		}
		return array[high];
	}

}
