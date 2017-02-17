import java.util.Arrays;

/*
 * Given two arrays, write a function to compute their intersection.
 */
import java.util.*;
public class IntersectionOfTwoArrays2 {
	
	public static void main(String args[]){
		int arr1[]={1, 2, 2, 1,3,4,5,6,3};
		int arr2[]={2,2,5,3,9,7};
		IntersectionOfTwoArrays2 object=new IntersectionOfTwoArrays2();
		System.out.println("Intersection of the 2 arrays is: ");
		int intersect[]=object.intersection(arr1, arr2);
		for(int i=0;i<intersect.length;i++){
			System.out.print(intersect[i] + "\t");
		}
	}
	
	public int[] intersection(int array1[],int array2[]){
		Arrays.sort(array1);
		Arrays.sort(array2);
		ArrayList<Integer> intersect=new ArrayList<Integer>();
		for(int i=0,j=0;i<array1.length&&j<array2.length;){
			if(array1[i]<array2[j])
				i++;
			else if(array1[i]>array2[j])
				j++;
			else{
				intersect.add(array1[i]);
				i++;
				j++;
			}
		}
		int result[]=new int[intersect.size()];
		for(int i=0;i<intersect.size();i++){
			result[i]=intersect.get(i);
		}		
		return result;
	}
}
