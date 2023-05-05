package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {

	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] pl = {"mumu","soe","poe","kai","mine"};
		String[] cl = {"kai","kai","mine","mine"};
		
		solution(pl,cl);
		

		
	}
	
	public static String[] solution(String[] players, String[] callings) {
		String[] answer = {};
		answer = new String[players.length];
		Map<String, Integer> map = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		
		for (int i = 0; i < players.length; i++) {
			
			map.put(players[i], i);
			map2.put(i, players[i]);
		}
	
		for (int i = 0; i < callings.length; i++) {
			
			int idx = map.get(callings[i]);
			String str = map2.get(idx-1);
			
			map.put(callings[i], idx-1);
			map.put(str, idx);
			
			map2.put(idx-1, callings[i]);
			map2.put(idx,str);
			
		}
		for (int k : map2.keySet()) {
			answer[k] = map2.get(k);
		
		}
		
		return answer;
	}
}
