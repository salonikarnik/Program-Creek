
public class SortedTwoSum {
	public static void main(String args[]){
		int array[]={1,2,4,5,8,12};
		int sum =9;
		SortedTwoSum obj = new SortedTwoSum();
		obj.findPair(array,sum);
	}

	public void findPair(int array[],int sum){
		int left=0;
		int right=array.length-1;
		while(left<right){
						
			if((array[left]+array[right])<sum)
				left++;
			else if((array[left]+array[right])>sum)
				right--;
			
			else if((array[left]+array[right])==sum){
				System.out.println("Index 1: " + left + ", Index 2: " + right);
				left++;
				right--;
			}
		}
		

	}

}
