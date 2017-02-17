/*
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2.
 */

import java.util.*;

public class TwoSum {
	public static void main(String args[]){
		int array[]={4,1,5,2,8,3,12};
		int sum =9;
		TwoSum obj = new TwoSum();
		obj.printArray(array);
		obj.findPair(array,sum);
	}

	public void findPair(int array[],int sum){
		HashMap<Integer,Integer> store = new HashMap<Integer,Integer>();
		int n=1;
		for(int i=0;i<array.length;i++){
			int complement=sum-array[i];
			if(store.containsKey(complement)){
				System.out.println("Pair " + n);
				n++;
				System.out.println("Index 1: " + store.get(complement) );
				System.out.print("Index 2: "+ i);
				System.out.println("\n");
			}
			else
				store.put(array[i],i);
		}
	}
	
	public void printArray(int array[]){
		System.out.println("Array Values");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + "  ");
		}
		System.out.println("\n");
	}

}
