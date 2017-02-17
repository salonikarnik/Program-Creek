/*
 * Given a sorted integer array without duplicates, return the summary of its ranges for consecutive numbers.
 */

import java.util.*;
public class SummaryRanges{
	
	public static void main(String args[]){
		int array[]={0,1,2,4,5,7};
		SummaryRanges obj=new SummaryRanges();
		System.out.println(obj.summary(array));
	}
	
	public ArrayList<String> summary(int array[]){
		ArrayList<String> range= new ArrayList<String>();		
		if(array.length==0)
			return range;
		else if(array.length==1){
			range.add(array[0] + "");
			return range;
		}
		int i=0;
		int flag;
		while(i<array.length){
			StringBuilder summingUp =new StringBuilder();
			summingUp.append(array[i]);
			flag=0;
			while(i<array.length-1  && array[i]+1==array[i+1]){
				flag=1;
				i++;
			}
			if(flag==1){
				summingUp.append("->");
				summingUp.append(array[i]);
			}
			range.add(summingUp.toString());
			i++;
		}		
		return range;		
	}

}
