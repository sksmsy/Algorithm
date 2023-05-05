package pr;

import java.util.HashMap;
import java.util.Map;

public class 추억점수 {

	public static void main(String[] args) {
		
		
		String[] a = { "may", "kein", "kain", "radi"};
		int[]  b = {5, 10, 1, 3};
		String[][] ab= {{"may", "kein", "kain", "radi"},
				{"may", "kein", "brin", "deny"}, 
				{"kon", "kain", "may", "coni"}};
		solution(a,b,ab);
	}
	
	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        answer = new int[photo.length];
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<name.length; i++){
            map.put(name[i],yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            int scr =0;
            for(int j=0; j<photo[i].length; j++){
            	
            	scr += map.getOrDefault(photo[i][j], 0);
            }
            answer[i] = scr;
        }
        
        return answer;
    }
}
