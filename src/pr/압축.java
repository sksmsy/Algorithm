package pr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 압축 {

	class Solution {
	    public int[] solution(String msg) {
	        int[] answer = {};
	        
	        Map<String,Integer> map = new HashMap<>();
	        
	        int idx = 26;
	        
	        for(int i=0; i<=26; i++){
	            int j = 'A'+i;
	            char c = (char)j;
	            map.put(c+"",i+1);
	        }
	        List<Integer> list = new ArrayList<>();
	        for(int i=0; i<msg.length()-1; i++){
	            String str = msg.charAt(i)+""+msg.charAt(i+1)+"";
	            if(map.containsKey(str)){
	                list.add(map.get(str));
	                map.put(str+msg.charAt(i+2),++idx);
	                
	            }else{
	                list.add(map.get(str.charAt(0)));
	                map.put(str, ++idx);
	            }
	        }
	        
	        for(int i=0; i<list.size(); i++){
	            System.out.print(list.get(i)+" ");
	        }
	        
	        return answer;
	    }
	}
}
