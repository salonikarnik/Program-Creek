/*
 * Given an array nums, write a function to move all 0’s to the end of it 
 * while maintaining the relative order of the non-zero elements.
 */
public class MoveZeroes {
	public static void main(String args[]){
		int array[]={0, 1, 0, 3, 12};
		MoveZeroes obj=new MoveZeroes();
		obj.move(array);
	}
	
	public void move(int array[]){
		int i=0,j=0;
		
		while(j<array.length){
			if(array[j]==0){
				j++;
			}
			else{
				array[i]=array[j];
				i++;
				j++;
			}
		}
		
		while(i<array.length){
			array[i]=0;
			i++;
		}
		
		for(int k=0;k<array.length;k++){
			System.out.print("\t" + array[k]);
		}
	}

}
