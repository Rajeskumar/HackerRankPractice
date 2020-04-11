package main.com.hackerRnk.practice;

import java.io.IOException;
/* Problem Description:
 * Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During his last hike he took exactly  steps. For every step he took, he noted if it was an uphill, , or a downhill,  step. Gary's hikes start and end at sea level and each step up or down represents a  unit change in altitude. We define the following terms:

	A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
	A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
	Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.

	For example, if Gary's path is , he first enters a valley  units deep. Then he climbs out an up onto a mountain  units high. 
	Finally, he returns to sea level and ends his hike.
 */
public class CountingValleyProblem {

	// Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

    	String[] pathArray = s.split("");
    	boolean inValley = false;
    	int noOfValleys = 0;
    	int pathDirection = 0;
    	
    	for(String path : pathArray) {
    		if(path.equalsIgnoreCase("D")) {
    			pathDirection -=1;
    		}else if(path.equalsIgnoreCase("U")){
    			pathDirection +=1;
    		}
    		if(pathDirection <0) {
    			inValley = true;
    		}else if(pathDirection>0){
    			inValley = false;
    		}
    		//Valley traversed when came to sea level from Valley i.e. inValley is true
    		if(pathDirection ==0 && inValley) {
    			noOfValleys++;
    		}
    	}
    	return noOfValleys;
    }
    public static void main(String[] args) throws IOException {
    	int n =12;
    	String s= "DDUUDDUDUUUD";        
        
        System.out.print("No of Valleys Traversed :"+countingValleys(n,s));

    }
}
