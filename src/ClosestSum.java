/*
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. 
 * Return the sum of the three integers. 
 * You may assume that each input would have exactly one solution.
 */
import java.util.*;

public class ClosestSum {
	public static void main(String args[]){
		int array[]={-1,2,1,-4};
		int sum = 1;
		ClosestSum obj = new ClosestSum();
		int result=obj.findSum(array,sum);	
		System.out.println("Sum closest to given sum of " + sum + "  is: " + result);
	}
	public int findSum(int array[],int sum){
		int minimum=Integer.MAX_VALUE;
		Arrays.sort(array);
		int result=0;
		for(int i=0;i<array.length-2;i++){
			int left=i+1;
			int right=array.length-1;
			while(left<right){
				int addition=array[i]+array[left]+array[right];
				int difference=Math.abs(sum-addition);
				if(addition==sum)
					return addition;
				if(difference<minimum){
					minimum=difference;
					result=addition;
				}
				if(addition<=sum)
					left++;
				else
					right--;
			}
		}
		return result;
	}
}
