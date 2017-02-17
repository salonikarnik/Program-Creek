/*
 *Given an array and a value, remove all instances of that value in place and return the new length.
 *(Note: The order of elements can be changed. It doesn’t matter what you leave beyond the new length.)
 */
public class RemoveElement {
	public static void main(String args[]){
		int array[]={2,3,1,2,4,3};
		int value=3;
		RemoveElement obj = new RemoveElement();
		System.out.println("The length of the new array is " + obj.remove(array,value));
	}
	
	public int remove(int array[],int val){
		int i=0,j=0;
		while(j<array.length){
			if(array[j]!=val){
				array[i]=array[j];
				i++;
			}
			j++;
		}
		return i;
	}

}
