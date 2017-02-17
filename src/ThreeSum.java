/*
 *Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 *Find all unique triplets in the array which gives the sum of zero.
 *Note: Elements in a triplet (a,b,c) must be in non-descending order. (ie, a  b  c)
 *The solution set must not contain duplicate triplets.
 */
import java.util.*;
 
public class ThreeSum {
	public List<List<Integer>> findTriplet(int array[]){
		int left,right;
		List<List<Integer>> triplet = new ArrayList<List<Integer>>();
		Arrays.sort(array);
		for(int i=0;i<array.length-2;i++){
			if(i==0||array[i]>array[i-1]){
				left=i+1;
				right=array.length-1;
				while(left<right){
					if(array[i]+array[left]+array[right]==0){
						List<Integer> element=new ArrayList<Integer>();
						element.add(array[i]);
						element.add(array[left]);
						element.add(array[right]);
						triplet.add(element);
					}
					while(left<right&&array[left]==array[left-1])
						left++;
					while(left<right&&array[right]==array[right-1])
						right--;
					if(array[i]+array[left]+array[right]<0)
						left++;
					else
						right--;
				}
			}
		}
		return triplet;		
	}
	
	public static void main(String args[]){
		int array[]={4,6,-2,0,1,-1,3,-4,-3,5,-2};
		ThreeSum obj = new ThreeSum();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result=obj.findTriplet(array);
		System.out.println("Triplets whose sum=0 are:");
		for(List<Integer> number:result){
			System.out.println(number);
		}
	}
}
