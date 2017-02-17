/*Given n non-negative integers representing an elevation map where the width of each bar is 1,
* compute how much water it is able to trap after raining.
*/

public class TrappingRainWater {
	
	public static void main(String args[]){
		int elevation[]={0,1,0,2,1,0,1,3,2,1,2,1};	
		TrappingRainWater object=new TrappingRainWater();
		System.out.println("Amount of water trapped after raining = " + object.trapWater(elevation) + " units");
	}
	
	public int trapWater(int elevation[]){

		int maxLeftElevation[]=new int[elevation.length];
		int maxRightElevation[]=new int[elevation.length];
		
		int max=elevation[0];
		maxLeftElevation[0]=elevation[0];
		
		for(int i=1;i<elevation.length;i++){
			if(elevation[i]<max){
				maxLeftElevation[i]=max;
			}
			else{
				maxLeftElevation[i]=elevation[i];
				max=elevation[i];
						
			}
		}
		max=elevation[elevation.length-1];
		maxRightElevation[elevation.length-1]=elevation[elevation.length-1];
		
		for(int i=elevation.length-2;i>=0;i--){
			if(elevation[i]<max){
				maxRightElevation[i]=max;
			}
			else{
				maxRightElevation[i]=elevation[i];
				max=elevation[i];
			}
		}
		int waterAmount=0;
		for(int i=0;i<elevation.length;i++){
			waterAmount+=Math.min(maxLeftElevation[i],maxRightElevation[i])-elevation[i];
		}
		
		return waterAmount;
	}

}
