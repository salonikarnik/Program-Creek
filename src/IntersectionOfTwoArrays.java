/*
 * Given two arrays, write a function to compute their intersection 
 */
import java.util.*;
public class IntersectionOfTwoArrays {
	
	public static void main(String args[]){
		int arr1[]={1, 2, 2, 1,3,4,5,6,3};
		int arr2[]={2,2,5,3};
		IntersectionOfTwoArrays object=new IntersectionOfTwoArrays();
		System.out.println("Intersection of the 2 arrays is: ");
		int intersect[]=object.intersection(arr1, arr2);
		for(int i=0;i<intersect.length;i++){
			System.out.print(intersect[i] + "\t");
		}
		
	}
	
	public int[] intersection(int arr1[],int arr2[]){
		HashSet<Integer> set1=new HashSet<Integer>();
		for(int number:arr1){
			set1.add(number);
		}
		HashSet<Integer> reducedSet2=new HashSet<Integer>();
		for(int numbers:arr2){
			if(set1.contains(numbers))
				reducedSet2.add(numbers);
		}
		int result[]=new int[reducedSet2.size()];
		int i=0;
		for(int num:reducedSet2){
			result[i]=num;
			i++;
		}
		
		return result;
	}

}