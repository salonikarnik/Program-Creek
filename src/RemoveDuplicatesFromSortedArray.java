/*
 * Given a sorted array, remove the duplicates in place such that each element appearonly once.
 * Return the new length. 
 * Do not allocate extra space for another array,you must do this in place with constant memory.
 */
public class RemoveDuplicatesFromSortedArray {
	
	public static void main(String args[]){
		int array[]={1,1,2,2,2,6,7,7,7,8,8,8,8,8,8,9};
		RemoveDuplicatesFromSortedArray obj=new RemoveDuplicatesFromSortedArray();
		System.out.println("\nLength of Array after removing duplicates is : " + obj.removeDuplicate(array));
	}
	
	public int removeDuplicate(int array[]){
		int i=0,j=1;
		int count=0;
		while(j<array.length){
			if(array[i]==array[j]){
				count++;
				j++;
			}
			else{
				array[i+1]=array[j];
				i++;
				j++;
			}
		}
		System.out.println("Array after removing duplicates:");
		for(int k=0;k<i+1;k++){
			System.out.print("\t"+array[k]);
		}
		return array.length-count;	
	}

}
