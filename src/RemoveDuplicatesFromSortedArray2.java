/*
 * Follow up for "Remove Duplicates": What if duplicates are allowed at most twice?
 * So this problem also requires in-place array manipulation.
 */
public class RemoveDuplicatesFromSortedArray2 {
	public static void main(String args[]){
		int array[]={1,2,2,2,6,7,7,7,8,8,8,8,8,8,9};
		RemoveDuplicatesFromSortedArray2 obj = new RemoveDuplicatesFromSortedArray2();
		System.out.println("\nLength of Array after removing duplicates is : "+obj.removeDuplicatesButKeepAtmost2(array));
	}
	public int removeDuplicatesButKeepAtmost2(int array[]){
		int i=1,j=2;
		if(array.length<=2)
			return array.length;
		while(j<array.length){
			if(array[j]==array[i]&&array[j]==array[i-1]){
				j++;
			}
			else{
				i++;
				array[i]=array[j];
				j++;
			}			
		}
		return i+1;
	}	

}
