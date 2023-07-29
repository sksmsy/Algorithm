package pr;

public class 방금그곡 {
	import java.util.*;

	class Solution {
	    
	    class Music{
	        int time;
	        String nm;
	        String code;
	        
	        public Music(int time, String nm, String code){
	            this.time = time;
	            this.nm = nm;
	            this.code = code; 
	        } 
	    }
	    
	    public String solution(String m, String[] musicinfos) {
	        String answer = "(None)";
	        
	        Music arr[] = new Music[musicinfos.length];
	        
	        for(int i=0; i<arr.length; i++){
	            String tmp[] = musicinfos[i].split(",");
	            
	            String time[] = tmp[0].split(":");
	            int start = (Integer.parseInt(time[0])*60) + Integer.parseInt(time[1]);
	            
	            time = tmp[1].split(":");
	            int end = (Integer.parseInt(time[0])*60) + Integer.parseInt(time[1]);
	            
	            String code ="";
	            int idx =0;
	            for(int j=0; j<=end-start; j++){
	                if(idx >= tmp[3].length()){
	                    idx = 0;                    
	                }else{
	                    code += tmp[3].charAt(idx);
	                    idx++;
	                }
	            }
	            arr[i] = new Music(end-start,tmp[2],code);
	        }
	        
	        List<Music>list = new ArrayList<>();
	        for(int i=0; i<arr.length; i++){
	            if(arr[i].code.length() < m.length()){
	                continue;
	            }
	            int charIdx = arr[i].code.indexOf(m);
	            int mIdx = m.indexOf("#");
	            if(charIdx > -1 && mIdx == -1){
	                if(!(arr[i].code.charAt(charIdx+m.length())=='#')){
	                   list.add(new Music(arr[i].time,arr[i].nm,arr[i].code));
	                }
	            }else if(charIdx > -1 && mIdx > -1){
	                list.add(new Music(arr[i].time,arr[i].nm,arr[i].code));
	            }
	        }
	        
	        if(list.size() == 1){
	            answer = list.get(0).nm;
	        }else if(list.size() > 1){
	           int max = 0;
	           for(int i=0; i<list.size(); i++){
	               if(max == list.get(i).time) continue;
	               
	               if(max < list.get(i).time){
	                   max = list.get(i).time;
	                   answer = list.get(i).nm;
	               }
	           }
	        }
	        
	        return answer;
	    }
	}
}
