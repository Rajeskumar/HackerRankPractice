/**
 * 
 */
package main.com.hackerRnk.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author A2ND9ZZ
 *
 */
public class ArrayRotation {

	static List<Integer> getMaxElem (List<Integer> a, List<Integer> rotate){
		List<Integer> result = new ArrayList<Integer>();
		Integer[] arrA = (Integer[]) a.toArray(new Integer[a.size()]);
		Integer[] rot =  (Integer[]) rotate.toArray(new Integer[rotate.size()]);
//		List<Integer> result = new ArrayList<Integer>();
		
		int n = arrA.length;
		int len = rot.length;
		for(int i=0;i<len;i++){
			int elem = rot[i];
			int[] rotArray = new int[n];
			if (elem>0){
				for(int j=0;j<n;j++){
					int newIndx = Math.abs(j+n-elem);
					rotArray[(newIndx)%n]=arrA[j];
				}
//				arrA = rotArray;
			}else{
				  for (int i1 = 0; i1 < n; i1++) {
				      rotArray[i1]=arrA[i1];
				  }
			}
				System.out.println(Arrays.toString(rotArray));
//				Arrays.sort(rotArray);
				int max = 0;
				int maxind = 0;
				int size = rotArray.length;
				for(int x=0;x<size;x++){
				
					if(rotArray[x]>max){
						max = rotArray[x];
						maxind = x;
					}
				}
//				System.out.println(maxind);
				result.add(maxind);
			
		}
		System.out.println(result.toString());
		return result; 
	}
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(3);
		a.add(5);
		List<Integer> rotate = new ArrayList<Integer>();
		rotate.add(6);
		rotate.add(9);
		rotate.add(12);
		int rot=2;
		List<Integer> res = getMaxElem(a,rotate);
		for(int i=0;i<res.size();i++){
			System.out.println(res.get(i));
		}
	}
}
