package pr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 성격유형 {
	public static void main(String[] args) {
		
		String a[] = {"TR", "RT", "TR"};
		int b[] = {7, 1, 3};
		System.out.println(solution(a,b));
		
	}
	
	public static String solution(String[] survey, int[] choices) {
        String answer = "";
 
        List<Map<String, Integer>> lm = new ArrayList<Map<String,Integer>>();
        initLm(lm);
        
        for(int i=0; i<survey.length; i++){
                
            String str = survey[i];
            int sc = choices[i];
            
            if(sc > 4){
                str =str.substring(1);
                sc = 1;
            }else if(sc < 4){
                str =str.substring(0,1);
                sc = 1;
            }else{
                sc = 0;
            }
            
            for(int j=0; j<4; j++){
                if(lm.get(j).containsKey(str)){
                    lm.get(j).put(str, lm.get(j).get(str)+1);
                }
            }
            
        };
        
        
        
        for(int i=0; i<4; i++){
            String arr1[] = new String[2];
            int arr2[] = new int[2];
            int k = 0;
            
            for(String strKey : lm.get(i).keySet()){
                arr1[k] = strKey;
                arr2[k] = lm.get(i).get(strKey);
                k++;
            }

            if(arr2[0] > arr2[1]){
                answer+= arr1[0];
            }else if( arr2[0] < arr2[1]){
                answer+=arr1[1];
            }else if( arr2[0] == arr2[1]){
                Arrays.sort(arr1);
                answer+=arr1[0];
            }
                
        }
        
        
        return answer;
    }
    
    
    public static List<Map<String,Integer>> initLm(List<Map<String, Integer>> lm){
    	
    	for (int i = 0; i <4; i++) {
		
    		lm.add(new HashMap<String,Integer>());
		}
        lm.get(0).put("R",0);
        lm.get(0).put("T",0);
        lm.get(1).put("C",0);
        lm.get(1).put("F",0);
        lm.get(2).put("J",0);
        lm.get(2).put("M",0);
        lm.get(3).put("A",0);
        lm.get(3).put("N",0);
        
        return lm;
    }
}
