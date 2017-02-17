/* Design and implement a TwoSum class. It should support the following operations:
 * add and find.
 *add - Add the number to an internal data structure.
 *find - Find if there exists any pair of numbers which sum is equal to the value.
 */
import java.util.*;

public class DataStructureDesignTwoSum {
	
	HashMap<Integer,Integer> store = new HashMap<Integer,Integer>();
	int count=0;
	
	public static void main(String args[]){
		
		DataStructureDesignTwoSum object = new DataStructureDesignTwoSum();
		object.add(5);
		object.add(1);
		object.add(8);
		object.add(12);
		object.add(4);
		object.print();
		System.out.println();
		System.out.println("Do pair of numbers exist for sum=9? \nAns: " + object.find(9));
		System.out.println("Do pair of numbers exist for sum=4? \nAns: " + object.find(4));
	}
	
	public void print(){
		System.out.println("Values present in the date structure:");
		for(Map.Entry<Integer,Integer> entry:store.entrySet()){
			System.out.print(entry.getKey() + "  ");
		}
	}

	public void add(int number){

		if(store.containsKey(number)){
			store.put(number,store.get(number)+1);
		}
		else
			store.put(number,1);

	}

	public boolean find(int sum){
		
		for(Map.Entry<Integer,Integer> entry:store.entrySet()){
			int complement = sum-entry.getKey();
			if(store.containsKey(complement)){
				return true;		
			}
		}
		return false;
	}
}
