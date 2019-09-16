/*Class:		CSE 1323L/W01
Date:			8/28/2019  
Name:			Terrence Smith
Assgnmt Name:	Hometown Temperatures    
Assignment#:	Module 1A; Takes last weeks temperatures, then outputs lowest and highest
Resources: 	Introduction to Java Programming and Data Structures: Comp Version 11th e, 
 		Ch. 7 PowerPoint slides, https://www.youtube.com/watch?v=L06uGnF4IpY */

public class HomtownTemperatures {
	// calculates and returns highest temperature
	public static int maxTemp(int[] pastTemp) {
		int max = pastTemp[0];
		
		// finds largest element in array
		for (int i = 0; i<pastTemp.length; i++) {
			if (max < pastTemp[i]) {
				max = pastTemp[i];
			}
		}
		return max;
	}
	// calculates and returns lowest temperature
	public static int minTemp(int[] pastTemp) {
		int min = pastTemp[0];
		
		// finds smallest element in array
		for (int i = 0; i<pastTemp.length; i++) {
			if (min > pastTemp[i]) {
				min = pastTemp[i];
			}
		}
		return min;
	}
	
	public static int[] addDegrees(int[] pastTemp) {
		//creates and returns original array then adds 10 to each
		for (int i = 0; i<pastTemp.length; i++) {
			pastTemp[i] += 10;
		}
		return pastTemp;
	}
	
	public static void main(String[] args) {
		// declares, creates and initializes the array pastTemp with 7 elements
		int[] pastTemp = {95, 91, 93, 93, 93, 91, 93};
		
		// output to user
		System.out.println("Lowest temperature: " + minTemp(pastTemp));
		System.out.println("Highest temperature: " + maxTemp(pastTemp));
		System.out.println("\nLast weeks temperatures plus 10 degrees:");
		
		int[] degrees = addDegrees(pastTemp);
		
		for (int i = 0; i<7; i++) {
			System.out.print(degrees[i]+" ");   
		}					
	}
}
