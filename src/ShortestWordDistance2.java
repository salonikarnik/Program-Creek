/*
 * This is a follow up of Shortest Word Distance. 
 * The only difference is now you are given the list of words. Y
 * Your method will be called repeatedly many times with different parameters. 
 * How would you optimize it?
 * Design a class which receives a list of words in the constructor, 
 * and implements a method that takes two words word1 and word2 
 * and return the shortest distance between these two words in the list.
 */
import java.io.*;
import java.util.*;

public class ShortestWordDistance2 {
	
	private Map<String,List<Integer>> store;
	
	public static void main(String args[])throws IOException{
		String input[]={"practice", "makes", "perfect", "coding", "makes"};
		ShortestWordDistance2 object=new ShortestWordDistance2(input);
		String word1="practice";
		String word2="perfect";
		String word3="makes";
		String word4="coding";
		System.out.println("Shortest distance between " + word1 + " and " + word2 + " is " + object.findDistance(word1,word2));
		System.out.println("Shortest distance between " + word1 + " and " + word3 + " is " + object.findDistance(word1,word3));
		System.out.println("Shortest distance between " + word2 + " and " + word4 + " is " + object.findDistance(word2,word4));
		System.out.println("Shortest distance between " + word3 + " and " + word4 + " is " + object.findDistance(word3,word4));
		System.out.println("Shortest distance between " + word1 + " and " + word4 + " is " + object.findDistance(word1,word4));
		
	}
	
	public ShortestWordDistance2(String input[]) throws IOException{
		store=new HashMap<String,List<Integer>>();
		for(int i=0;i<input.length;i++){
			String word=input[i];
			if(store.containsKey(word)){
				store.get(word).add(i);
			}
			else{
				List<Integer> list=new ArrayList<Integer>();
				list.add(i);
				store.put(word,list);
			}
		}
	}
	
	public int findDistance(String word1,String word2){
		int minimum = Integer.MAX_VALUE;
		int position1,position2;
		List<Integer> list1=store.get(word1);
		List<Integer> list2=store.get(word2);
		for(int i=0,j=0;i<list1.size()&&j<list2.size();){
			position1=list1.get(i);
			position2=list2.get(j);
			minimum=Math.min(minimum,Math.abs(position2-position1));
			if(position1<position2)				
				i++;
			else
				j++;			
		}
		
		return minimum;
	}

}
