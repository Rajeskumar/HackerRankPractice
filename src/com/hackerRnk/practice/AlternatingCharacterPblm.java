package com.hackerRnk.practice;


import java.util.*;

public class AlternatingCharacterPblm {
	
	public static void main(String args[]){
	
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		solveAlternateCharPblm(input);
}

	public static void solveAlternateCharPblm(String input) {
		String[] inArr = input.split("");
		int len = input.length();
		int deletion =0;
		for(int i=0;i<len;i++){
			if(i==0) continue;		
			if(inArr[i].equalsIgnoreCase(inArr[i-1])){
				deletion+=1;
}
}
	System.out.println(deletion);
}
}
