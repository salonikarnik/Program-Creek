/*
 * This is a follow-up problem of Shortest Word Distance.
 * The only difference is now word1 could be the same as word2.
 * Given a list of words and two words word1 and word2, 
 * return the shortest distance between these two words in the list.
 * word1 and word2 may be the same and they represent two individual words in the list.
 */
public class ShortestWordDistance3 {
	
	public static void main(String args[]){
		String input[]={"practice", "makes", "perfect", "coding", "makes"};
		ShortestWordDistance3 object=new ShortestWordDistance3();
		String word1="makes";
		String word2="makes";
		String word3="perfect";
		System.out.println("Shortest distance between " + word1 + " and " + word2 + " is " + object.findMinDistance(input,word1,word2));
		System.out.println("Shortest distance between " + word1 + " and " + word3 + " is " + object.findMinDistance(input,word1,word3));
	}
	
	public int findMinDistance(String [] input, String word1, String word2){
		long min = Integer.MAX_VALUE;
		long position1=min;
		long position2=-min;
		boolean areTheTwoWordsEqual=word1.equals(word2);
		for(int i=0;i<input.length;i++){
			if(input[i].equals(word1)){
				if(areTheTwoWordsEqual){
					position1=position2;
					position2=i;
				}
				else
					position1=i;
			}
			else if(input[i].equals(word2)){
				position2=i;
			}
			min=Math.min(min,Math.abs(position1-position2));
		}
		
		return (int)min;
	}

}
