/*
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
 *  n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
 *  Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 */

public class MostWater {
	public static void main(String args[]){
		int heightArray[]={3,4,6,4,5,4,7,3};
		MostWater obj = new MostWater();
		System.out.println("Container with most water has max area = " + obj.findAreaMax(heightArray));
	}
	
	public int findAreaMax(int heightArray[]){
		int left=0;
		int right=heightArray.length-1;
		int max=0;
		while(left<right){
			max = Math.max(max,(right-left)*Math.min(heightArray[left],heightArray[right]));
			if(heightArray[left]<heightArray[right])
				left++;
			else
				right--;
		}
		return max;
	}

} 
