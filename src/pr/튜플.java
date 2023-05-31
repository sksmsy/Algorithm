package pr;

import java.util.HashMap;
import java.util.Map;

public class 튜플 {

	public static void main(String[] args) {
		System.out.println(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"));
	}
	
    public static int[] solution(String s) {
        Map<Integer,Integer> map = new HashMap<>();
        
        s = s.replaceAll("\\{","");
        s = s.replaceAll("\\}","");

        String[] cArr = s.split("\\,");
        
        for(int i=0; i<cArr.length; i++){
        	int num = Integer.parseInt(cArr[i]);
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int[] answer = new int[map.size()];
       
        map.forEach((key,value)->{
        	answer[Math.abs(value-map.size())] = key;
        });
        String tmp = "110011";
        String [] aaaa = tmp.split("0");
        for (int i = 0; i < aaaa.length; i++) {
			String string = aaaa[i];
			System.out.println(string);
		}
        System.out.println();
        return answer;
    }
}
