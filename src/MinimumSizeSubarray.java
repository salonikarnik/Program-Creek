/*
 * Given an array of n positive integers and a positive integer s, 
 * find the minimal length of a subarray of which the sum  s.
 * If there isn’t one, return 0 instead.
 */
public class MinimumSizeSubarray {
	
	public static void main(String args[]){
		
		int array[]={2,3,1,2,4,3};
		int sum=7;
		MinimumSizeSubarray object = new MinimumSizeSubarray();
		System.out.println("The minimum length of the sub-array is : " + object.findMinSubArray(array,sum));
	}
	
	public int findMinSubArray(int array[],int sum){
		int length=array.length;
		int left=0,right=0,result=0;
		int min=Integer.MAX_VALUE;
		if(array.length==0||array==null)
			return 0;
		while(right<length){
			result+=array[right++];
			while(result>=sum){
				min=Math.min(min,right-left);
				result-=array[left++];				
			}
		}
		return min==Integer.MAX_VALUE?0:min;
	}

}
