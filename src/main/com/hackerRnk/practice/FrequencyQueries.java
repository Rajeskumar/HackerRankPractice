/**
 * 
 */
package main.com.hackerRnk.practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/**
 * @author A2ND9ZZ
 *
 */
public class FrequencyQueries {

	static List<Integer> freqQuery1(List<List<Integer>> queries){
		List<Integer> result = new ArrayList<Integer>();

//        HashMap<Integer,Integer> ds = new HashMap<Integer,Integer>();
        TreeMap<Integer,Integer> ds = new TreeMap<Integer,Integer>();
        int count=0;
        for(List queryList:queries){
            int operation = (int) queryList.get(0);
            int data = (int) queryList.get(1);

            switch(operation){
            case 1 :
                if(ds.containsKey(data)){
                    count = ds.get(data);
                    ds.put(data, count+1);
                }else{
                    ds.put(data, 1);
                }
                break;
            
            case 2 :
                if(ds.containsKey(data)){
                    int n = ds.get(data);
                    if(n>1){
//                        ds.remove(data);
                        ds.put(data, n-1);
                    }else{
                        ds.remove(data);
                    }
                }
                break;
                
            case 3 :
                if(ds.containsValue(data)){
                    result.add(1);
                }else{
                    result.add(0);
                }
                break;
            }
        }
        
        return result;
	}
	// Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
    List<Integer> result = new ArrayList<Integer>();
    HashMap<Integer,Integer> ds = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> freq = new  HashMap<Integer,Integer>();
    int count=0;
    int c85 = 0;
//    List<Integer> freqItem = null;
    int itemFreq = 0;
    int counter = 0;
    for(List queryList:queries){
        int operation = (int) queryList.get(0);
        int data = (int) queryList.get(1);
      /*  System.out.println(counter++);
        if(c85>82){
        	System.out.println("TEst");
        }
        if(counter==16){
//        	System.out.println("Tsting");
        }*/
        switch(operation){
        case 1 :
            if(ds.containsKey(data)){
                count = ds.get(data);
                ds.put(data, count+1);
            	if(null!=freq.get(count)){
            		if(freq.get(count)<=1){
            			freq.remove(count);
            		}else{
                		itemFreq = freq.get(count);
                		freq.put(count, itemFreq-1);
                	}
            	}
//            	itemFreq = freq.get(count+1);
                if(null !=  freq.get(count+1) && freq.get(count+1)>=1){
                	itemFreq = freq.get(count+1);
                	freq.put(count+1, itemFreq+1);
                }else{
                	freq.put(count+1, 1);
                }
                
            }else{
                ds.put(data, 1);
                if(freq.containsKey(1)){
                	itemFreq = freq.get(1);
                	freq.put(1, itemFreq+1);
                }else{
                	freq.put(1, 1);
                }
            }
            break;
        
        case 2 :
            if(ds.containsKey(data)){
                int n = ds.get(data);
                if(n>1){
//                    ds.remove(data);
                    ds.put(data, n-1);
                }else{
                    ds.remove(data);
                }
                //freq LOgic
                
                if(null!=freq.get(n) && freq.get(n)>1){
                	itemFreq = freq.get(n);
                	freq.put(n, itemFreq-1);
                }else{
                	freq.remove(n);
                }
            }
            break;
            
        case 3 :
//        	c85++;
            if(freq.containsKey(data)){
                result.add(1);
            }else{
                result.add(0);
            }
            break;
        }
    }
    
    return result;
    }
    
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		List<List<Integer>> queries = getInput();
		
		try{
			InputStream inputStream       = new FileInputStream("C:\\Users\\A2ND9ZZ\\Desktop\\TestInput.txt");
//			Reader      inputStreamReader = new InputStreamReader(inputStream);

			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

	        int q = Integer.parseInt(bufferedReader.readLine().trim());

	        List<List<Integer>> queries = new ArrayList<>();

	        for (int i = 0; i < q; i++) {
	            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	            List<Integer> queriesRowItems = new ArrayList<>();

	            for (int j = 0; j < 2; j++) {
	                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
	                queriesRowItems.add(queriesItem);
	            }

	            queries.add(queriesRowItems);
	        }

	        List<Integer> ans = freqQuery(queries);

	        bufferedReader.close();
	        System.out.println(queries.toString());
			System.out.println(ans.toString());
			
		}catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		
	}


	/**
	 * @return
	 */
	private static List<List<Integer>> getInput() {
		List<Integer> input = new ArrayList<Integer>();
		List<List<Integer>> queries = new ArrayList<List<Integer>>();
		input.add(1);
		input.add(10000004);
		queries.add(input);
		input = new ArrayList<Integer>();
		input.add(1);
		input.add(10000016);
		queries.add(input);
		input = new ArrayList<Integer>();
		input.add(1);
		input.add(10000011);
		queries.add(input);
		input = new ArrayList<Integer>();
		input.add(3);
		input.add(1);
		queries.add(input);
		input = new ArrayList<Integer>();
		input.add(2);
		input.add(10000016);
		queries.add(input);
		input = new ArrayList<Integer>();
		input.add(1);
		input.add(10000004);
		queries.add(input);
		input = new ArrayList<Integer>();
		input.add(2);
		input.add(10000016);
		queries.add(input);
		input = new ArrayList<Integer>();
		input.add(3);
		input.add(2);
		queries.add(input);
		input = new ArrayList<Integer>();
		input.add(1);
		input.add(10000004);
		queries.add(input);
		input = new ArrayList<Integer>();
		input.add(1);
		input.add(10000016);
		queries.add(input);
		input = new ArrayList<Integer>();
		input.add(1);
		input.add(4);
		queries.add(input);
		input = new ArrayList<Integer>();
		input.add(1);
		input.add(5);
		queries.add(input);
		input = new ArrayList<Integer>();
		input.add(3);
		input.add(3);
		queries.add(input);
		input = new ArrayList<Integer>();
		input.add(1);
		input.add(3);
		queries.add(input);
		return queries;
	}

	
}
