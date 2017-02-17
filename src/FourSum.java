/*
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c+ d = target?
 * Find all unique quadruplets in the array which gives the sum of target.
 * Note: Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a b  c  d) 
 * The solution set must not contain duplicate quadruplets.
 */

import java.util.*;
public class FourSum {
	public static void main(String args[]){
		int array[]={4,6,-2,0,1,-1,-2,3,-4,-3,5};
		int sum = 7;
		FourSum obj = new FourSum();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result=obj.findQuad(array,sum);
		System.out.println("Quadruplets whose sum = " + sum + " are:");
		for(List<Integer> number:result){
			System.out.println(number);
		}
	
	}
	
	public List<List<Integer>> findQuad(int arr[],int sum){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int left,right;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-3;i++){
			if(i!=0&&arr[i]==arr[i-1])
				continue;
			for(int j=i+1;j<arr.length-2;j++){
				if(j!=i+1&&arr[j]==arr[j-1])
					continue;
				left=j+1;
				right=arr.length-1;
				while(left<right){
					if(arr[i]+arr[j]+arr[left]+arr[right]>sum)
						right--;
					else if(arr[i]+arr[j]+arr[left]+arr[right]<sum)
						left++;
					else{
						List<Integer> temp = new ArrayList<Integer>();
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[left]);
						temp.add(arr[right]);
						result.add(temp);
					}
					while(left<right&&arr[left]==arr[left-1])
						left++;
					while(left<right&&arr[right]==arr[right-1])
						right--;					
				}				
			}
		}
		return result;
	}
}
