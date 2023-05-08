package pr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class temp {
	public static void main(String[] args) {
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] d = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		
		solution(today,terms,d);
	}
    public static int solution(String today, String[] terms, String[] privacies) {
        int answer[];
        
        String tyymmdd[] = today.split("\\.");
        int y = Integer.parseInt(tyymmdd[0]);
                int m = Integer.parseInt(tyymmdd[1]);
                int d = Integer.parseInt(tyymmdd[2]);


        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<terms.length; i++){
            StringTokenizer st = new StringTokenizer(terms[i]);
            String typ = st.nextToken();
            int mm = Integer.parseInt(st.nextToken());
            
            map.put(typ,mm);
        }
        String ymd[] = new String[privacies.length];
        String inTyp[] = new String[privacies.length];
        for(int i=0; i<privacies.length; i++){
            StringTokenizer st = new StringTokenizer(privacies[i]);
            ymd[i] = st.nextToken();
            inTyp[i] = st.nextToken();
        }
        int cnt = 0;
    
        
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<privacies.length; i++){
            
            int pri = map.get(inTyp[i]);
            
            String yymmdd[] = ymd[i].split("\\.");
            
            int yy = Integer.parseInt(yymmdd[0]);
            int mm = Integer.parseInt(yymmdd[1]);
            int dd = Integer.parseInt(yymmdd[2]);
            dd += 27;
            if(dd> 28){
                
                dd-= 28;
                mm+= 1;
            }
            mm+= pri-1;
            if(mm > 12){
                
                yy += 1;
                mm %= 12;
            }            

            
            if(yy < y) {
            	list.add(i+1);
            }else if(yy==y) {
            	
               	if(mm < m) {
               		list.add(i+1);
            	}else if(mm == m) {
            		if(dd < d) {
            			list.add(i+1);
            		}
            	}
            	
            }
            
//            if(d < dd){
//                if(m< mm){
//                    if(y< yy){
//                       list.add(i+1);
//                    }
//                }
//                
//            }
            
        }
        
        answer= new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
      for(int i=0; i<list.size(); i++){
          System.out.print(answer[i] + " ");
        }
	return 0;
    }
}
