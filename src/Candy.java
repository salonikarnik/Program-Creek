/*
 * There are N children standing in a line. 
 * Each child is assigned a rating value. 
 * You are giving candies to these children subjected to the following requirements:
 * 1. Each child must have at least one candy. 
 * 2. Children with a higher rating get more candies than their neighbors.
 * What is the minimum candies you must give?
 */
public class Candy {
	
	public static void main(String args[]){
		int ratings[]={5,1,3,2,4,7};
		Candy object = new Candy();
		System.out.println("Minimum number of candies that must be given = " + object.minCandiesGiven(ratings));
	}
	
	public int minCandiesGiven(int ratings[]){
		int candies[]=new int[ratings.length];
		candies[0]=1;
		for(int i=1;i<=ratings.length-1;i++){
			if(ratings[i]>ratings[i-1]){
				candies[i]=candies[i-1]+1;
			}
			else
				candies[i]=1;
		}
		
		
		for(int i=ratings.length-2;i>=0;i--){
			if(ratings[i]>ratings[i+1]){
				candies[i]=Math.max(candies[i],candies[i+1]+1);
			}
		}
		System.out.println();
		
		int result=0;
		for(int candy:candies){
			result+=candy;
		}
		return result;
	}

}
